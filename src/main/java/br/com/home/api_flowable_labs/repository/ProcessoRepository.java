package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.dto.AcaoDoNodeProjection;
import br.com.home.api_flowable_labs.dto.FluxoAndTaskHistoryProjection;
import br.com.home.api_flowable_labs.dto.TaskHistoryProjection;
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
            SELECT
                  ti.id_ as idTaskInstance,
                  ti.name_ as nameTask,
                  ti.create_ as createAt,
                  ti.end_ as endAt,
                  ti.isopen_ as openTask,
                  pd.name_ AS nameFlux,
                  tpi.id_proc_inst AS idProcessInstance
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
                  and tpi.id_proc_inst = :idProcessInstance
              ORDER BY
                  ti.create_;
            """, nativeQuery = true)
    List<TaskHistoryProjection> findTaskHistoryByNrProcessoAndProcessInstance(@Param("nrProcesso") String nrProcesso,
                                                                              @Param("idProcessInstance") Long idProcessInstance);


    @Query(value = """
        WITH RECURSIVE base AS (
            SELECT
                ti.id_                AS "idTask",
                ti.name_              AS "nameTask",
                ti.create_            AS "createAt",
                ti.end_               AS "endAt",
                usu.id_usuario        AS "idUsuario",
                usu.ds_nome           AS "dsNome",
                ti.isopen_            AS "openTask",
                pd.id_                AS "idProcessDefinition",
                pd.name_              AS "nameFlux",
                ti.id_                AS "idTaskInstance",
                tpi.id_proc_inst      AS "idProcessInstance",
                jt.id_                AS "idJbpmToken",
                jt.node_              AS "idJbpmNode",
                nd.name_              AS "nodeInGraph",
                pi.superprocesstoken_ AS "superProcessToken"
            FROM jbpm_taskinstance ti
            INNER JOIN core.tb_processo_instance tpi ON tpi.id_proc_inst = ti.procinst_
            INNER JOIN jbpm_processinstance pi       ON pi.id_ = ti.procinst_
            INNER JOIN jbpm_processdefinition pd     ON pd.id_ = pi.processdefinition_
            INNER JOIN jbpm_token jt                 ON jt.id_ = pi.roottoken_
            INNER JOIN jbpm_node nd                  ON nd.id_ = jt.node_
            LEFT JOIN acl.tb_usuario_login usu       ON usu.ds_login = ti.actorid_
            INNER JOIN core.tb_processo tp           ON tp.id_processo = tpi.id_processo
            WHERE tp.nr_processo = :nrProcesso
        ),
        primeiro AS (
            SELECT "idProcessInstance"
            FROM base
            ORDER BY "createAt"
            LIMIT 1
        ),
        hierarquia AS (
            SELECT
                pi.id_,
                pi.superprocesstoken_,
                0 AS nivel,
                ARRAY[pi.id_] AS caminho
            FROM jbpm_processinstance pi
            INNER JOIN primeiro p ON p."idProcessInstance" = pi.id_
        
            UNION ALL
        
            SELECT
                pai.id_,
                pai.superprocesstoken_,
                h.nivel + 1,
                h.caminho || pai.id_
            FROM hierarquia h
            INNER JOIN jbpm_token tk            ON tk.id_ = h.superprocesstoken_
            INNER JOIN jbpm_processinstance pai ON pai.id_ = tk.processinstance_
            WHERE NOT pai.id_ = ANY (h.caminho)
        ),
        resultado AS (
            SELECT
                2 AS grupo,
                0 AS nivel,
                b.*
            FROM base b
        
            UNION ALL
        
            SELECT
                1                     AS grupo,
                h.nivel,
                NULL                  AS "idTask",
                NULL                  AS "nameTask",
                pi.start_             AS "createAt",
                pi.end_               AS "endAt",
                NULL                  AS "idUsuario",
                NULL                  AS "dsNome",
                NULL                  AS "openTask",
                pd.id_                AS "idProcessDefinition",
                pd.name_              AS "nameFlux",
                NULL                  AS "idTaskInstance",
                pi.id_                AS "idProcessInstance",
                jt.id_                AS "idJbpmToken",
                jt.node_              AS "idJbpmNode",
                nd.name_              AS "nodeInGraph",
                pi.superprocesstoken_ AS "superProcessToken"
            FROM hierarquia h
            INNER JOIN jbpm_processinstance pi   ON pi.id_ = h.id_
            INNER JOIN jbpm_processdefinition pd ON pd.id_ = pi.processdefinition_
            INNER JOIN jbpm_token jt             ON jt.id_ = pi.roottoken_
            INNER JOIN jbpm_node nd              ON nd.id_ = jt.node_
            WHERE h.nivel >= 1
        ),
        processos AS (
            -- Sua consulta base
            SELECT jpd.id_, jpd.name_, tpi.id_proc_inst
            FROM core.tb_processo_instance tpi
            INNER JOIN core.tb_processo tp          ON tp.id_processo = tpi.id_processo
            INNER JOIN jbpm_processinstance jp      ON jp.id_ = tpi.id_proc_inst
            INNER JOIN jbpm_processdefinition jpd   ON jpd.id_ = jp.processdefinition_
            WHERE tp.nr_processo = :nrProcesso
        )
        SELECT
            p.id_          AS id,
            p.name_        AS name,
            p.id_proc_inst AS idProcInst,
            CASE
                WHEN por_instancia.itens IS NOT NULL THEN 'instancia'
                WHEN por_definicao.itens IS NOT NULL THEN 'definicao'
                ELSE 'nenhuma'
            END AS tipoCorrespondencia,
            CAST(COALESCE(por_instancia.itens, por_definicao.itens, '[]'::jsonb) AS text) AS itens
        FROM processos p
        -- 1ª tentativa: casa por definição E instância
        LEFT JOIN LATERAL (
            SELECT jsonb_agg(
                       to_jsonb(r) - 'grupo'
                       ORDER BY r.grupo, r.nivel DESC, r."createAt"
                   ) AS itens
            FROM resultado r
            WHERE r."idProcessDefinition" = p.id_
              AND r."idProcessInstance"   = p.id_proc_inst
        ) por_instancia ON TRUE
        -- 2ª tentativa (fallback): casa só pela definição, quando a 1ª não achou nada
        LEFT JOIN LATERAL (
            SELECT jsonb_agg(
                       to_jsonb(r) - 'grupo'
                       ORDER BY r.grupo, r.nivel DESC, r."createAt"
                   ) AS itens
            FROM resultado r
            WHERE por_instancia.itens IS NULL
              AND r."idProcessDefinition" = p.id_
        ) por_definicao ON TRUE
        ORDER BY p.id_proc_inst;
    """, nativeQuery = true)
    List<FluxoAndTaskHistoryProjection> findFluxAndTaskHistoryProjection(@Param("nrProcesso") String nrProcesso);

}
