package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "jbpm_taskinstance", schema = "public")
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

    public JbpmTaskInstance() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getClazz() {
        return clazz;
    }

    public void setClazz(Character clazz) {
        this.clazz = clazz;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public LocalDateTime getCreate() {
        return create;
    }

    public void setCreate(LocalDateTime create) {
        this.create = create;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(Boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    public Boolean getIsSuspended() {
        return isSuspended;
    }

    public void setIsSuspended(Boolean isSuspended) {
        this.isSuspended = isSuspended;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIsSignalling() {
        return isSignalling;
    }

    public void setIsSignalling(Boolean isSignalling) {
        this.isSignalling = isSignalling;
    }

    public Boolean getIsBlocking() {
        return isBlocking;
    }

    public void setIsBlocking(Boolean isBlocking) {
        this.isBlocking = isBlocking;
    }

}
