-- =========================================================
-- 1. Tabelas base sem dependências externas
-- =========================================================

CREATE TABLE public.jbpm_exceptionhandler (
    id_                  int8         NOT NULL,
    exceptionclassname_  varchar(4000) NULL,
    type_                bpchar(1)    NULL,
    graphelement_        int8         NULL,
    processdefinition_   int8         NULL,
    graphelementindex_   int4         NULL,
    node_                int8         NULL,
    transition_          int8         NULL,
    task_                int8         NULL,
    CONSTRAINT jbpm_exceptionhandler_pkey PRIMARY KEY (id_)
);

-- =========================================================
-- 2. jbpm_processdefinition (sem FK para jbpm_node ainda)
-- =========================================================

CREATE TABLE public.jbpm_processdefinition (
    id_                    int8         NOT NULL,
    class_                 bpchar(1)    NOT NULL,
    name_                  varchar(255) NULL,
    description_           varchar(4000) NULL,
    version_               int4         NULL,
    isterminationimplicit_ bool         NULL,
    startstate_            int8         NULL,   -- FK adicionada depois (ALTER TABLE)
    CONSTRAINT jbpm_processdefinition_pkey PRIMARY KEY (id_)
);

CREATE INDEX idx_procdef_name   ON public.jbpm_processdefinition USING btree (name_);
CREATE INDEX idx_procdef_strtst ON public.jbpm_processdefinition USING btree (startstate_);

-- =========================================================
-- 3. jbpm_delegation (depende de jbpm_processdefinition)
-- =========================================================

CREATE TABLE public.jbpm_delegation (
    id_                int8          NOT NULL,
    classname_         varchar(4000) NULL,
    configuration_     varchar(4000) NULL,
    configtype_        varchar(255)  NULL,
    processdefinition_ int8          NULL,
    CONSTRAINT jbpm_delegation_pkey PRIMARY KEY (id_),
    CONSTRAINT jbpm_delegation_processdefinition__fk
        FOREIGN KEY (processdefinition_) REFERENCES public.jbpm_processdefinition(id_)
);

CREATE INDEX idx_deleg_prcd ON public.jbpm_delegation USING btree (processdefinition_);

-- =========================================================
-- 4. jbpm_node (depende de jbpm_processdefinition e jbpm_delegation;
--    FKs para jbpm_action adicionadas depois)
-- =========================================================

CREATE TABLE public.jbpm_node (
    id_                   int8          NOT NULL,
    class_                bpchar(1)     NOT NULL,
    name_                 varchar(255)  NULL,
    description_          varchar(4000) NULL,
    processdefinition_    int8          NULL,
    isasync_              bool          NULL,
    isasyncexcl_          bool          NULL,
    action_               int8          NULL,   -- FK adicionada depois (ALTER TABLE)
    superstate_           int8          NULL,
    subprocname_          varchar(255)  NULL,
    subprocessdefinition_ int8          NULL,
    decisionexpression_   varchar(1000) NULL,
    decisiondelegation    int8          NULL,
    script_               int8          NULL,   -- FK adicionada depois (ALTER TABLE)
    parentlockmode_       varchar(255)  NULL,
    signal_               int4          NULL,
    createtasks_          bool          NULL,
    endtasks_             bool          NULL,
    nodecollectionindex_  int4          NULL,
    CONSTRAINT jbpm_node_pkey PRIMARY KEY (id_),
    CONSTRAINT jbpm_node_processdefinition__fk
        FOREIGN KEY (processdefinition_) REFERENCES public.jbpm_processdefinition(id_),
    CONSTRAINT jbpm_node_decisiondelegation_fk
        FOREIGN KEY (decisiondelegation) REFERENCES public.jbpm_delegation(id_),
    CONSTRAINT jbpm_node_superstate__fk
        FOREIGN KEY (superstate_) REFERENCES public.jbpm_node(id_),
    CONSTRAINT jbpm_node_subprocessdefinition__fk
        FOREIGN KEY (subprocessdefinition_) REFERENCES public.jbpm_processdefinition(id_)
);

CREATE INDEX idx_node_action      ON public.jbpm_node USING btree (action_);
CREATE INDEX idx_node_name        ON public.jbpm_node USING btree (name_);
CREATE INDEX idx_node_procdef     ON public.jbpm_node USING btree (processdefinition_);
CREATE INDEX idx_node_suprstate   ON public.jbpm_node USING btree (superstate_);
CREATE INDEX idx_pstate_sbprcdf   ON public.jbpm_node USING btree (subprocessdefinition_);
CREATE INDEX jbpm_node_decisiondelegation_idx ON public.jbpm_node USING btree (decisiondelegation);
CREATE INDEX jbpm_node_script_idx ON public.jbpm_node USING btree (script_);

-- Resolve FK circular: processdefinition -> node
ALTER TABLE public.jbpm_processdefinition
    ADD CONSTRAINT jbpm_processdefinition_startstate__fk
        FOREIGN KEY (startstate_) REFERENCES public.jbpm_node(id_);

-- =========================================================
-- 5. jbpm_transition (depende de jbpm_node)
-- =========================================================

CREATE TABLE public.jbpm_transition (
    id_   int8 NOT NULL,
    CONSTRAINT jbpm_transition_pkey PRIMARY KEY (id_)
    -- adicione aqui as demais colunas conforme seu schema completo
);

-- =========================================================
-- 6. jbpm_event (depende de jbpm_node, jbpm_processdefinition,
--    jbpm_task e jbpm_transition)
--    FK para jbpm_task adicionada depois (ALTER TABLE)
-- =========================================================

CREATE TABLE public.jbpm_event (
    id_                int8         NOT NULL,
    eventtype_         varchar(255) NULL,
    type_              bpchar(1)    NULL,
    graphelement_      int8         NULL,
    processdefinition_ int8         NULL,
    node_              int8         NULL,
    transition_        int8         NULL,
    task_              int8         NULL,   -- FK adicionada depois (ALTER TABLE)
    CONSTRAINT jbpm_event_pkey PRIMARY KEY (id_),
    CONSTRAINT jbpm_event_node__fk
        FOREIGN KEY (node_) REFERENCES public.jbpm_node(id_),
    CONSTRAINT jbpm_event_processdefinition__fk
        FOREIGN KEY (processdefinition_) REFERENCES public.jbpm_processdefinition(id_),
    CONSTRAINT jbpm_event_transition__fk
        FOREIGN KEY (transition_) REFERENCES public.jbpm_transition(id_)
);

CREATE INDEX jbpm_event_node_idx              ON public.jbpm_event USING btree (node_);
CREATE INDEX jbpm_event_processdefinition_idx ON public.jbpm_event USING btree (processdefinition_);
CREATE INDEX jbpm_event_task_idx              ON public.jbpm_event USING btree (task_);
CREATE INDEX jbpm_event_transition_idx        ON public.jbpm_event USING btree (transition_);

-- =========================================================
-- 7. jbpm_action (depende de jbpm_delegation, jbpm_event,
--    jbpm_exceptionhandler, jbpm_processdefinition;
--    auto-referência em referencedaction_ e timeraction_)
-- =========================================================

CREATE TABLE public.jbpm_action (
    id_                    int8          NOT NULL,
    class                  bpchar(1)     NOT NULL,
    name_                  varchar(255)  NULL,
    ispropagationallowed_  bool          NULL,
    actionexpression_      varchar(4000) NULL,
    isasync_               bool          NULL,
    referencedaction_      int8          NULL,
    actiondelegation_      int8          NULL,
    event_                 int8          NULL,
    processdefinition_     int8          NULL,
    expression_            varchar(4000) NULL,
    timername_             varchar(255)  NULL,
    duedate_               varchar(255)  NULL,
    repeat_                varchar(255)  NULL,
    transitionname_        varchar(255)  NULL,
    timeraction_           int8          NULL,
    eventindex_            int4          NULL,
    exceptionhandler_      int8          NULL,
    exceptionhandlerindex_ int4          NULL,
    CONSTRAINT jbpm_action_pkey PRIMARY KEY (id_),
    CONSTRAINT jbpm_action_actiondelegation__fk
        FOREIGN KEY (actiondelegation_) REFERENCES public.jbpm_delegation(id_),
    CONSTRAINT jbpm_action_event__fk
        FOREIGN KEY (event_) REFERENCES public.jbpm_event(id_),
    CONSTRAINT jbpm_action_exceptionhandler__fk
        FOREIGN KEY (exceptionhandler_) REFERENCES public.jbpm_exceptionhandler(id_),
    CONSTRAINT jbpm_action_processdefinition__fk
        FOREIGN KEY (processdefinition_) REFERENCES public.jbpm_processdefinition(id_),
    CONSTRAINT jbpm_action_referencedaction__fk
        FOREIGN KEY (referencedaction_) REFERENCES public.jbpm_action(id_),
    CONSTRAINT jbpm_action_timeraction__fk
        FOREIGN KEY (timeraction_) REFERENCES public.jbpm_action(id_)
);

CREATE INDEX idx_action_actndl             ON public.jbpm_action USING btree (actiondelegation_);
CREATE INDEX idx_action_event              ON public.jbpm_action USING btree (event_);
CREATE INDEX idx_action_procdf             ON public.jbpm_action USING btree (processdefinition_);
CREATE INDEX jbpm_action_exceptionhandler_idx  ON public.jbpm_action USING btree (exceptionhandler_);
CREATE INDEX jbpm_action_referencedaction_idx  ON public.jbpm_action USING btree (referencedaction_);
CREATE INDEX jbpm_action_timeraction_idx       ON public.jbpm_action USING btree (timeraction_);

-- Resolve FKs circulares: node -> action
ALTER TABLE public.jbpm_node
    ADD CONSTRAINT jbpm_node_action__fk
        FOREIGN KEY (action_) REFERENCES public.jbpm_action(id_);

ALTER TABLE public.jbpm_node
    ADD CONSTRAINT jbpm_node_script__fk
        FOREIGN KEY (script_) REFERENCES public.jbpm_action(id_);

-- =========================================================
-- 8. jbpm_taskcontroller (depende de jbpm_delegation)
-- =========================================================

CREATE TABLE public.jbpm_taskcontroller (
    id_                      int8 NOT NULL,
    taskcontrollerdelegation_ int8 NULL,
    CONSTRAINT jbpm_taskcontroller_pkey PRIMARY KEY (id_),
    CONSTRAINT jbpm_taskcontroller_taskcontrollerdelegation__fk
        FOREIGN KEY (taskcontrollerdelegation_) REFERENCES public.jbpm_delegation(id_)
);

CREATE INDEX jbpm_taskcontroller_taskcontrollerdelegation_idx
    ON public.jbpm_taskcontroller USING btree (taskcontrollerdelegation_);

-- =========================================================
-- 9. jbpm_moduledefinition (depende de jbpm_processdefinition;
--    FK para jbpm_task adicionada depois)
-- =========================================================

CREATE TABLE public.jbpm_moduledefinition (
    id_                int8          NOT NULL,
    class_             bpchar(1)     NOT NULL,
    name_              varchar(4000) NULL,
    processdefinition_ int8          NULL,
    starttask_         int8          NULL,   -- FK adicionada depois (ALTER TABLE)
    CONSTRAINT jbpm_moduledefinition_pkey PRIMARY KEY (id_),
    CONSTRAINT jbpm_moduledefinition_processdefinition__fk
        FOREIGN KEY (processdefinition_) REFERENCES public.jbpm_processdefinition(id_)
);

CREATE INDEX idx_moddef_procdf ON public.jbpm_moduledefinition USING btree (processdefinition_);
CREATE INDEX jbpm_moduledefinition_starttask_idx ON public.jbpm_moduledefinition USING btree (starttask_);

-- =========================================================
-- 10. jbpm_swimlane (depende de jbpm_delegation e jbpm_moduledefinition)
-- =========================================================

CREATE TABLE public.jbpm_swimlane (
    id_                    int8          NOT NULL,
    name_                  varchar(255)  NULL,
    actoridexpression_     varchar(1000) NULL,
    pooledactorsexpression_ varchar(1000) NULL,
    assignmentdelegation_  int8          NULL,
    taskmgmtdefinition_    int8          NULL,
    CONSTRAINT jbpm_swimlane_pkey PRIMARY KEY (id_),
    CONSTRAINT jbpm_swimlane_assignmentdelegation__fk
        FOREIGN KEY (assignmentdelegation_) REFERENCES public.jbpm_delegation(id_),
    CONSTRAINT jbpm_swimlane_taskmgmtdefinition__fk
        FOREIGN KEY (taskmgmtdefinition_) REFERENCES public.jbpm_moduledefinition(id_)
);

CREATE INDEX jbpm_swimlane_assignmentdelegation_idx ON public.jbpm_swimlane USING btree (assignmentdelegation_);
CREATE INDEX jbpm_swimlane_taskmgmtdefinition_idx   ON public.jbpm_swimlane USING btree (taskmgmtdefinition_);

-- =========================================================
-- 11. jbpm_task (depende de jbpm_delegation, jbpm_processdefinition,
--     jbpm_node, jbpm_swimlane, jbpm_taskcontroller, jbpm_moduledefinition)
-- =========================================================

CREATE TABLE public.jbpm_task (
    id_                    int8          NOT NULL,
    name_                  varchar(255)  NULL,
    description_           varchar(4000) NULL,
    processdefinition_     int8          NULL,
    isblocking_            bool          NULL,
    issignalling_          bool          NULL,
    condition_             varchar(1000) NULL,
    duedate_               varchar(255)  NULL,
    priority_              int4          NULL,
    actoridexpression_     varchar(1000) NULL,
    pooledactorsexpression_ varchar(1000) NULL,
    taskmgmtdefinition_    int8          NULL,
    tasknode_              int8          NULL,
    startstate_            int8          NULL,
    assignmentdelegation_  int8          NULL,
    swimlane_              int8          NULL,
    taskcontroller_        int8          NULL,
    CONSTRAINT jbpm_task_pkey PRIMARY KEY (id_),
    CONSTRAINT jbpm_task_assignmentdelegation__fk
        FOREIGN KEY (assignmentdelegation_) REFERENCES public.jbpm_delegation(id_),
    CONSTRAINT jbpm_task_processdefinition__fk
        FOREIGN KEY (processdefinition_) REFERENCES public.jbpm_processdefinition(id_),
    CONSTRAINT jbpm_task_startstate__fk
        FOREIGN KEY (startstate_) REFERENCES public.jbpm_node(id_),
    CONSTRAINT jbpm_task_swimlane__fk
        FOREIGN KEY (swimlane_) REFERENCES public.jbpm_swimlane(id_),
    CONSTRAINT jbpm_task_taskcontroller__fk
        FOREIGN KEY (taskcontroller_) REFERENCES public.jbpm_taskcontroller(id_),
    CONSTRAINT jbpm_task_taskmgmtdefinition__fk
        FOREIGN KEY (taskmgmtdefinition_) REFERENCES public.jbpm_moduledefinition(id_),
    CONSTRAINT jbpm_task_tasknode__fk
        FOREIGN KEY (tasknode_) REFERENCES public.jbpm_node(id_)
);

CREATE INDEX idx_task_name              ON public.jbpm_task USING btree (name_);
CREATE INDEX idx_task_priority          ON public.jbpm_task USING btree (priority_);
CREATE INDEX idx_task_procdef           ON public.jbpm_task USING btree (processdefinition_);
CREATE INDEX idx_task_taskmgtdf         ON public.jbpm_task USING btree (taskmgmtdefinition_);
CREATE INDEX idx_task_tsknode           ON public.jbpm_task USING btree (tasknode_);
CREATE INDEX jbpm_task_assignmentdelegation_idx ON public.jbpm_task USING btree (assignmentdelegation_);
CREATE INDEX jbpm_task_startstate_idx   ON public.jbpm_task USING btree (startstate_);
CREATE INDEX jbpm_task_swimlane_idx     ON public.jbpm_task USING btree (swimlane_);
CREATE INDEX jbpm_task_taskcontroller_idx ON public.jbpm_task USING btree (taskcontroller_);

-- =========================================================
-- 12. Resolve FKs pendentes que apontam para jbpm_task
-- =========================================================

ALTER TABLE public.jbpm_moduledefinition
    ADD CONSTRAINT jbpm_moduledefinition_starttask__fk
        FOREIGN KEY (starttask_) REFERENCES public.jbpm_task(id_);

ALTER TABLE public.jbpm_event
    ADD CONSTRAINT jbpm_event_task__fk
        FOREIGN KEY (task_) REFERENCES public.jbpm_task(id_);