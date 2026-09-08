package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.model.JbpmAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsRepository extends JpaRepository<JbpmAction, Long> {

    @Query("""
            SELECT a FROM JbpmAction a
            JOIN FETCH a.event e
            JOIN FETCH e.node n
            WHERE a.processDefinition = :idProcessDefinition
                AND n.id = :idNode
            """)
    List<JbpmAction> findEventsByProcessDefinitionAndNode(@Param("idProcessDefinition") Long idProcessDefinition,
                                                            @Param("idNode") Long idNode);
}
