package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;

@Entity
@Table(name = "jbpm_event", schema = "public")
@Immutable
@Getter
@NoArgsConstructor
public class JbpmEvent implements Serializable {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "eventtype_", length = 255)
    private String eventType;

    @Column(name = "type_", length = 1)
    private Character type;

    @Column(name = "graphelement_")
    private Long graphElement;

    @Column(name = "processdefinition_")
    private Long processDefinition;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "node_", referencedColumnName = "id_")
    private JbpmNode node;

    @Column(name = "transition_")
    private Long transition;

    @Column(name = "task_")
    private Long task;

}
