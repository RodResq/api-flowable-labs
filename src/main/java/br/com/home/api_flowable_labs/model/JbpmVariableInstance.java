package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "jbpm_variableinstance", schema = "public")
public class JbpmVariableInstance {

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

    @Column(name = "taskinstance_")
    private Long taskInstance;

    public JbpmVariableInstance() {
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

    public Character getConverter() {
        return converter;
    }

    public void setConverter(Character converter) {
        this.converter = converter;
    }

    public LocalDateTime getDateValue() {
        return dateValue;
    }

    public void setDateValue(LocalDateTime dateValue) {
        this.dateValue = dateValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getLongIdClass() {
        return longIdClass;
    }

    public void setLongIdClass(String longIdClass) {
        this.longIdClass = longIdClass;
    }

    public Long getLongValue() {
        return longValue;
    }

    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    public String getStringIdClass() {
        return stringIdClass;
    }

    public void setStringIdClass(String stringIdClass) {
        this.stringIdClass = stringIdClass;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Long getProcessInstance() {
        return processInstance;
    }

    public void setProcessInstance(Long processInstance) {
        this.processInstance = processInstance;
    }

    public Long getTaskInstance() {
        return taskInstance;
    }

    public void setTaskInstance(Long taskInstance) {
        this.taskInstance = taskInstance;
    }
}
