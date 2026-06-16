package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "jbpm_taskinstance", schema = "public")
@Getter
@NoArgsConstructor
public class JbpmTaskInstance implements Serializable {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "class_", length = 1, nullable = false)
    private Character clazz;

    @Column(name = "version_", nullable = false)
    private Integer version;

    @Column(name = "name_", length = 255)
    private String name;

    @Column(name = "description_", length = 4000)
    private String description;

    @Column(name = "actorid_", length = 255)
    private String actorId;

    @Column(name = "create_")
    private LocalDateTime create;

    @Column(name = "start_")
    private LocalDateTime start;

    @Column(name = "end_")
    private LocalDateTime end;

    @Column(name = "duedate_")
    private LocalDateTime dueDate;

    @Column(name = "priority_")
    private Integer priority;

    @Column(name = "iscancelled_")
    private Boolean isCancelled;

    @Column(name = "issuspended_")
    private Boolean isSuspended;

    @Column(name = "isopen_")
    private Boolean isOpen;

    @Column(name = "issignalling_")
    private Boolean isSignalling;

    @Column(name = "isblocking_")
    private Boolean isBlocking;
}
