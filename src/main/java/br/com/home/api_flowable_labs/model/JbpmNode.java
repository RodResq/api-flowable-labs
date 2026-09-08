package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;

@Entity
@Table(name = "jbpm_node", schema = "public")
@Immutable
@Getter
@NoArgsConstructor
public class JbpmNode implements Serializable {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "class_", length = 1, nullable = false)
    private Character clazz;

    @Column(name = "name_", length = 255)
    private String name;

    @Column(name = "description_", length = 4000)
    private String description;

    @Column(name = "processdefinition_")
    private Long processDefinition;

    @Column(name = "isasync_")
    private Boolean isAsync;

    @Column(name = "isasyncexcl_")
    private Boolean isAsyncExcl;

    @Column(name = "action_")
    private Long action;

    @Column(name = "superstate_")
    private Long superstate;

    @Column(name = "subprocname_", length = 255)
    private String subProcName;

    @Column(name = "subprocessdefinition_")
    private Long subProcessDefinition;

    @Column(name = "decisionexpression_", length = 1000)
    private String decisionExpression;

    @Column(name = "decisiondelegation")
    private Long decisionDelegation;

    @Column(name = "script_")
    private Long script;

    @Column(name = "parentlockmode_", length = 255)
    private String parentLockMode;

    @Column(name = "signal_")
    private Integer signal;

    @Column(name = "createtasks_")
    private Boolean createTasks;

    @Column(name = "endtasks_")
    private Boolean endTasks;

    @Column(name = "nodecollectionindex_")
    private Integer nodeCollectionIndex;

}
