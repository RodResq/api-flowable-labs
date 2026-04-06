package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;

@Entity
@Table(name = "jbpm_task", schema = "public")
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

    public JbpmTask() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getProcessDefinition() {
        return processDefinition;
    }

    public void setProcessDefinition(Long processDefinition) {
        this.processDefinition = processDefinition;
    }

    public Boolean getIsBlocking() {
        return isBlocking;
    }

    public void setIsBlocking(Boolean isBlocking) {
        this.isBlocking = isBlocking;
    }

    public Boolean getIsSignalling() {
        return isSignalling;
    }

    public void setIsSignalling(Boolean isSignalling) {
        this.isSignalling = isSignalling;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getActorIdExpression() {
        return actorIdExpression;
    }

    public void setActorIdExpression(String actorIdExpression) {
        this.actorIdExpression = actorIdExpression;
    }

    public String getPooledActorsExpression() {
        return pooledActorsExpression;
    }

    public void setPooledActorsExpression(String pooledActorsExpression) {
        this.pooledActorsExpression = pooledActorsExpression;
    }

    public Long getTaskMgmtDefinition() {
        return taskMgmtDefinition;
    }

    public void setTaskMgmtDefinition(Long taskMgmtDefinition) {
        this.taskMgmtDefinition = taskMgmtDefinition;
    }

    public Long getTaskNode() {
        return taskNode;
    }

    public void setTaskNode(Long taskNode) {
        this.taskNode = taskNode;
    }

    public Long getStartState() {
        return startState;
    }

    public void setStartState(Long startState) {
        this.startState = startState;
    }

    public Long getAssignmentDelegation() {
        return assignmentDelegation;
    }

    public void setAssignmentDelegation(Long assignmentDelegation) {
        this.assignmentDelegation = assignmentDelegation;
    }

    public Long getSwimlane() {
        return swimlane;
    }

    public void setSwimlane(Long swimlane) {
        this.swimlane = swimlane;
    }

    public Long getTaskController() {
        return taskController;
    }

    public void setTaskController(Long taskController) {
        this.taskController = taskController;
    }
}
