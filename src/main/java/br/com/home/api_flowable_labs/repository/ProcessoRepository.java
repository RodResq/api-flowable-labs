package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.dto.AcaoDoNodeProjection;
import br.com.home.api_flowable_labs.dto.VariavelDaIntanciaProjection;
import br.com.home.api_flowable_labs.model.Processo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {

    @Query("SELECT DISTINCT p FROM Processo p")
    Page<Processo> findAllDistinct(Pageable pageable);

    @Query(value = """
            SELECT
                ti.id_,
                ti.name_,
                ti.create_,
                ti.end_,
                usu.id_usuario,
                usu.ds_nome,
                ti.isopen_,
                pd.name_ AS name_flx_,
                ti.id_ AS id_taskinstance,
                tpi.id_proc_inst AS id_process_instance,
                jt.id_ id_jbpm_token,
                jt.node_ id_jbpm_node,
                nd.name_ AS node_in_graph
            FROM
                jbpm_taskinstance ti
                INNER JOIN core.tb_processo_instance tpi ON tpi.id_proc_inst = ti.procinst_
                INNER JOIN jbpm_processinstance pi ON ti.procinst_ = pi.id_
                INNER JOIN jbpm_processdefinition pd ON pi.processdefinition_ = pd.id_
                INNER JOIN jbpm_token jt ON jt.id_ = pi.roottoken_
                INNER JOIN jbpm_node nd ON nd.id_ = jt.node_
                LEFT JOIN acl.tb_usuario_login usu ON usu.ds_login = ti.actorid_
                INNER JOIN core.tb_processo tp ON tp.id_processo = tpi.id_processo
            WHERE
                tp.nr_processo = :nrProcesso
            ORDER BY
                ti.create_
            """, nativeQuery = true)
    List<Object[]> findTaskInstancesByNrProcesso(@Param("nrProcesso") String nrProcesso);

    Optional<Processo> findByNrProcesso(String nrProcesso);


    @Query(value = """
            select
            	ja.id_ as idAction,
                ja.name_ as nameAction,
                ja.actionexpression_ as expressionAction,
                je.id_ as idEvent,
                je.eventtype_ as eventType,
                je.task_ as idTask,
                jn.id_ as idNode,
                jn.name_ as nameNode,
                jn.description_ as descriptionNode,
                jn.decisionexpression_ as decisionexpressionNode,
                jn.endtasks_ as endtasksNode
            from jbpm_action ja
            inner join jbpm_event je on je.id_ = ja.event_
            inner join jbpm_node jn on jn.id_ = je.node_
            where ja.processdefinition_ = :idProcessDefinition
            	and jn.id_ = :idNode;
            """, nativeQuery = true)
    List<AcaoDoNodeProjection> findAcoesDoNodoNoFluxo(@Param("idProcessDefinition") Long idProcessDefinition,
                                                      @Param("idNode") Long idNode);


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
