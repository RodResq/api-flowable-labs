package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.model.JbpmVariableInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JbpmVariableInstanceRepository extends JpaRepository<JbpmVariableInstance, Long> {

    List<JbpmVariableInstance> findByProcessInstanceAndTaskInstanceId(Long idProcessoInstance, Long idTaskInstance);
}
