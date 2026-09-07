package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.model.JbpmVariableAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JbpmVariableAccessRespository extends JpaRepository<JbpmVariableAccess, Long> {

    List<JbpmVariableAccess> findByTaskController(Long idTaskController);
}
