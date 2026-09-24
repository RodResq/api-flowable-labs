package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "jbpm_processinstance", schema = "public")
@Immutable
@Getter
@NoArgsConstructor
public class JbpmProcessInstance implements Serializable {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "version_", nullable = false)
    private Integer version;

    @Column(name = "key_", length = 255)
    private String key;

    @Column(name = "start_")
    private LocalDateTime start;

    @Column(name = "end_")
    private LocalDateTime end;

    @Column(name = "issuspended_")
    private Boolean isSuspended;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "processdefinition_", referencedColumnName = "id_")
    private JbpmProcessDefinition processDefinition;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "roottoken_", referencedColumnName = "id_")
    private JbpmToken rootToken;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "superprocesstoken_", referencedColumnName = "id_")
    private JbpmToken superProcessToken;

}
