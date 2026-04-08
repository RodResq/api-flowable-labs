package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.model.Processo;
import br.com.home.api_flowable_labs.dto.TaskInstanceDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
