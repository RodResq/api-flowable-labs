package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;

@Entity
@Table(name = "jbpm_action", schema = "public")
@Immutable
@Getter
@NoArgsConstructor
public class JbpmAction implements Serializable {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "`class`", length = 1, nullable = false)
    private Character clazz;

    @Column(name = "name_", length = 255)
    private String name;

    @Column(name = "ispropagationallowed_")
    private Boolean isPropagationAllowed;

    @Column(name = "actionexpression_", length = 4000)
    private String actionExpression;

    @Column(name = "isasync_")
    private Boolean isAsync;

    @Column(name = "referencedaction_")
    private Long referencedAction;

    @Column(name = "actiondelegation_")
    private Long actionDelegation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "event_", referencedColumnName = "id_")
    private JbpmEvent event;

    @Column(name = "processdefinition_")
    private Long processDefinition;

    @Column(name = "expression_", length = 4000)
    private String expression;

    @Column(name = "timername_", length = 255)
    private String timerName;

    @Column(name = "duedate_", length = 255)
    private String dueDate;

    @Column(name = "repeat_", length = 255)
    private String repeat;

    @Column(name = "transitionname_", length = 255)
    private String transitionName;

    @Column(name = "timeraction_")
    private Long timerAction;

    @Column(name = "eventindex_")
    private Integer eventIndex;

    @Column(name = "exceptionhandler_")
    private Long exceptionHandler;

    @Column(name = "exceptionhandlerindex_")
    private Integer exceptionHandlerIndex;

}
