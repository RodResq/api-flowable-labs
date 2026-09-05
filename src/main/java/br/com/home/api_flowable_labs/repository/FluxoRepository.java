package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.dto.ProcessoMovimentoProjection;
import br.com.home.api_flowable_labs.model.Fluxo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FluxoRepository extends JpaRepository<Fluxo, Long> {

    Optional<Fluxo> findByDsFluxo(String dsFluxo);

    @Query(value = """
            SELECT
                movimentacao.nr_processo as nrProcesso,
                movimentacao.id_processdefinition as idProcessDefinition,
                movimentacao.nm_fluxo as nmFluxo,
                movimentacao.id_processinstance as idProcessInstance,
                movimentacao.nm_tarefa as nmTarefa,
                movimentacao.id_node as idNode,
                movimentacao.id_token as idToken,
                movimentacao.id_task_instance as idTaskInstance,
                movimentacao.isopen_ as isOpen
            FROM (
                SELECT
                    tp.nr_processo,
                    pd.id_ AS id_processdefinition,
                    pd.name_ AS nm_fluxo,
                    pi.id_  as id_processinstance,
                    ti.name_ AS nm_tarefa,
                    nd.id_ as id_node,
                    jt.id_ as id_token,
                    tpt.id_task_instance,
                    ti.isopen_,
                    BOOL_OR(ti.isopen_) OVER (PARTITION BY tp.nr_processo, tpi.id_proc_inst) AS tem_aberta,
                    BOOL_OR(NOT ti.isopen_) OVER (PARTITION BY tp.nr_processo, tpi.id_proc_inst) AS tem_fechada
                FROM
                    jbpm_taskinstance ti
                    INNER JOIN core.tb_processo_instance tpi ON tpi.id_proc_inst = ti.procinst_
                    INNER JOIN jbpm_processinstance pi ON ti.procinst_ = pi.id_
                    INNER JOIN jbpm_processdefinition pd ON pi.processdefinition_ = pd.id_
                    INNER JOIN jbpm_token jt ON jt.id_ = pi.roottoken_
                    INNER JOIN jbpm_node nd ON nd.id_ = jt.node_
                    INNER JOIN core.tb_processo tp ON tp.id_processo = tpi.id_processo
                    INNER JOIN client.tb_processo_tarefa tpt ON tpt.id_process_instance = tpi.id_proc_inst
                WHERE
                    ti.create_ >= CURRENT_DATE - INTERVAL '1 day'
                    AND tpt.nm_fluxo = :fluxo
            ) movimentacao
            WHERE movimentacao.tem_aberta AND movimentacao.tem_fechada
            """, nativeQuery = true)
    List<ProcessoMovimentoProjection> findMovimentacoesProcessosPorFluxo(@Param("fluxo") String fluxo);
}
