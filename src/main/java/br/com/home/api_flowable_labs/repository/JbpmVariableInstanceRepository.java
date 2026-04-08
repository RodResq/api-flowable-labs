package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.model.JbpmVariableInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JbpmVariableInstanceRepository extends JpaRepository<JbpmVariableInstance, Long> {

    @Query("SELECT v FROM JbpmVariableInstance v WHERE v.processInstance = :idProcessoInstance AND v.taskInstance = :idTaskInstance")
    List<JbpmVariableInstance> findByProcessoInstanceAndTaskInstance(
            @Param("idProcessoInstance") Long idProcessoInstance,
            @Param("idTaskInstance") Long idTaskInstance
    );
}
