package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.dto.PerfilVisualizarTarefaProjection;
import br.com.home.api_flowable_labs.model.ProcessoTarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarefaRepository extends JpaRepository<ProcessoTarefa, Long> {

    @Query(value = """
            SELECT DISTINCT
                ptar.id_processo_tarefa AS idProcessoTarefa,
                ptar.nm_tarefa AS nmTarefa,
                ptar.id_processo_trf AS idProcessoTrf,
                p.nr_processo AS nrProcesso,
                papel.ds_nome AS papel,
                lmod.ds_localizacao AS modeloLocalizacao,
                lfis.ds_localizacao AS localizacaoFisica,
                ojc.ds_orgao_julgador_colegiado AS dsOrgaoJulgadorColegiado
            FROM
                client.tb_processo_tarefa ptar
                INNER JOIN core.tb_processo p ON p.id_processo = ptar.id_processo_trf
                INNER JOIN core.tb_proc_localizacao_ibpm tli ON tli.id_processo = p.id_processo
                    AND tli.id_task_jbpm = ptar.id_task
                INNER JOIN acl.tb_papel papel ON papel.id_papel = tli.id_papel
                INNER JOIN core.tb_localizacao lfis ON lfis.id_localizacao = ptar.id_localizacao
                INNER JOIN core.tb_localizacao lmod ON lmod.id_localizacao = tli.id_localizacao
                LEFT OUTER JOIN client.tb_orgao_julgador_colgiado ojc ON ojc.id_orgao_julgador_colegiado = ptar.id_orgao_julgador_colegiado
            WHERE
                ptar.id_processo_tarefa = :idTarefa
            """, nativeQuery = true)
    List<PerfilVisualizarTarefaProjection> findPerfilVisualizarTarefa(@Param("idTarefa") Long idTarefa);
}
