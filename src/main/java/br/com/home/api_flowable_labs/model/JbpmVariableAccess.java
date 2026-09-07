package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;

@Entity
@Table(name = "jbpm_variableaccess", schema = "public")
@Immutable
@Getter
@NoArgsConstructor
public class JbpmVariableAccess implements Serializable {

    @Id
    @Column(name = "id_")
    private Long id;

    @Column(name = "variablename_", length = 255)
    private String variableName;

    @Column(name = "access_", length = 255)
    private String access;

    @Column(name = "mappedname_", length = 255)
    private String mappedName;

    @Column(name = "script_")
    private Long script;

    @Column(name = "processstate_")
    private Long processState;

    @Column(name = "taskcontroller_")
    private Long taskController;

    @Column(name = "index_")
    private Integer index;

}
