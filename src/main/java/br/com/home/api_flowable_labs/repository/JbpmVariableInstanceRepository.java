package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.dto.VariableInstanceProjection;
import br.com.home.api_flowable_labs.model.JbpmVariableInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JbpmVariableInstanceRepository extends JpaRepository<JbpmVariableInstance, Long> {

    @Query("""
        SELECT
            v.processInstance AS idProcessInstance,
            v.taskInstance.id AS idTaskInstance,
            t.id AS idToken,
            v.name AS name,
            v.clazz AS clazz,
            v.stringValue AS stringValue,
            v.dateValue AS dateValue,
            v.doubleValue AS doubleValue
        FROM JbpmVariableInstance v
        JOIN v.token t
        WHERE v.processInstance = :idProcessoInstance
        """)
    List<VariableInstanceProjection> findByProcessInstance(@Param("idProcessoInstance") Long idProcessoInstance);

    List<JbpmVariableInstance> findByProcessInstanceAndTaskInstance(Long idProcessoInstance, Long IdTaskInstance);
}

