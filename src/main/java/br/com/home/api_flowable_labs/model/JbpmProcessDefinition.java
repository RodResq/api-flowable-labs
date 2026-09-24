package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;

@Entity
@Table(name = "jbpm_processdefinition", schema = "public")
@Immutable
@Getter
@NoArgsConstructor
public class JbpmProcessDefinition implements Serializable {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "class_", length = 1, nullable = false)
    private Character clazz;

    @Column(name = "name_", length = 255)
    private String name;

    @Column(name = "description_", length = 4000)
    private String description;

    @Column(name = "version_")
    private Integer version;

    @Column(name = "isterminationimplicit_")
    private Boolean isTerminationImplicit;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "startstate_", referencedColumnName = "id_")
    private JbpmNode startState;

}
