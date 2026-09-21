package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.dto.VariavelDaIntanciaProjection;
import br.com.home.api_flowable_labs.model.JbpmVariableInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JbpmVariableInstanceRepository extends JpaRepository<JbpmVariableInstance, Long> {

    List<JbpmVariableInstance> findByProcessInstanceAndTaskInstanceId(Long idProcessoInstance, Long idTaskInstance);

    List<JbpmVariableInstance> findByProcessInstanceAndTaskInstanceIsNull(Long idProcessoInstance);

    @Query(value = """
            select
                jv.id_ as idVariableIntance,
                jv.class_ as classJbpmVariableInstance,
                jv.name_  as name,
                jv.token_  as idToken,
                jv.tokenvariablemap_ as idTokenVariableMap,
                jv.processinstance_ as idProcessInstance,
                jv.bytearrayvalue_ as idByteArrayValue,
                jv.datevalue_ as dateValue,
                jv.doublevalue_ as doubleValue,
                jv.longidclass_ as longIdClass,
                jv.longvalue_ as longValue,
                jv.taskinstance_ as idTaskInstance,
                jt.id_  as idJbpmToken,
                jt.start_  as startJbpmToken,
                jt.end_ as endJbpmToken,
                jt.nodeenter_ as dateNodeEnter,
                jt.node_ as idNode
             from jbpm_variableinstance jv
             inner join jbpm_token jt on jt.id_ = jv.token_
             where jv.processinstance_ = :idProcessInstance and jv.token_ = :idToken
            """, nativeQuery = true)
    List<VariavelDaIntanciaProjection> findVariavelsDaIntsancia(@Param("idProcessInstance") Long idProcessInstance,
                                                                @Param("idToken") Long idToken);

}
