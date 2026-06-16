package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jbpm_task", schema = "public")
@Getter
@NoArgsConstructor
public class JbpmTask {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "name_", length = 255)
    private String name;

    @Column(name = "description_", length = 4000)
    private String description;

    @Column(name = "processdefinition_")
    private Long processDefinition;

    @Column(name = "isblocking_")
    private Boolean isBlocking;

    @Column(name = "issignalling_")
    private Boolean isSignalling;

    @Column(name = "condition_", length = 1000)
    private String condition;

    @Column(name = "duedate_", length = 255)
    private String dueDate;

    @Column(name = "priority_")
    private Integer priority;

    @Column(name = "actoridexpression_", length = 1000)
    private String actorIdExpression;

    @Column(name = "pooledactorsexpression_", length = 1000)
    private String pooledActorsExpression;

    @Column(name = "taskmgmtdefinition_")
    private Long taskMgmtDefinition;

    @Column(name = "tasknode_")
    private Long taskNode;

    @Column(name = "startstate_")
    private Long startState;

    @Column(name = "assignmentdelegation_")
    private Long assignmentDelegation;

    @Column(name = "swimlane_")
    private Long swimlane;

    @Column(name = "taskcontroller_")
    private Long taskController;

}
