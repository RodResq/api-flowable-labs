package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "jbpm_variableinstance", schema = "public")
@Getter
@AllArgsConstructor
public class JbpmVariableInstance implements Serializable {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "class_", length = 1, nullable = false)
    private Character clazz;

    @Column(name = "version_", nullable = false)
    private Integer version;

    @Column(name = "name_", length = 255)
    private String name;

    @Column(name = "converter_", length = 1)
    private Character converter;

    @Column(name = "datevalue_")
    private LocalDateTime dateValue;

    @Column(name = "doublevalue_")
    private Double doubleValue;

    @Column(name = "longidclass_", length = 255)
    private String longIdClass;

    @Column(name = "longvalue_")
    private Long longValue;

    @Column(name = "stringidclass_", length = 255)
    private String stringIdClass;

    @Column(name = "stringvalue_", length = 10000)
    private String stringValue;

    @Column(name = "processinstance_")
    private Long processInstance;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "taskinstance_", referencedColumnName = "id_")
    private JbpmTaskInstance taskInstance;

}
