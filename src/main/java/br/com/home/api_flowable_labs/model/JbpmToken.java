package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "jbpm_token", schema = "public")
@Immutable
@Getter
@NoArgsConstructor
public class JbpmToken implements Serializable {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "version_", nullable = false)
    private Integer version;

    @Column(name = "name_", length = 255)
    private String name;

    @Column(name = "start_")
    private LocalDateTime start;

    @Column(name = "end_")
    private LocalDateTime end;

    @Column(name = "nodeenter_")
    private LocalDateTime nodeEnter;

    @Column(name = "nextlogindex_")
    private Integer nextLogIndex;

    @Column(name = "isabletoreactivateparent_")
    private Boolean isAbleToReactivateParent;

    @Column(name = "isterminationimplicit_")
    private Boolean isTerminationImplicit;

    @Column(name = "issuspended_")
    private Boolean isSuspended;

    @Column(name = "lock_", length = 255)
    private String lock;

    @Column(name = "node_")
    private Long node;

    @Column(name = "processinstance_")
    private Long processInstance;

    @Column(name = "parent_")
    private Long parent;

    @Column(name = "subprocessinstance_")
    private Long subProcessInstance;

}
