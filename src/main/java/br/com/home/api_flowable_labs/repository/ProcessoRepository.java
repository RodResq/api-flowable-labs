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
                pd.name_ AS name_flx_
            FROM
                jbpm_taskinstance ti
                INNER JOIN core.tb_processo_instance tpi ON tpi.id_proc_inst = ti.procinst_
                INNER JOIN jbpm_processinstance pi ON ti.procinst_ = pi.id_
                INNER JOIN jbpm_processdefinition pd ON pi.processdefinition_ = pd.id_
                LEFT JOIN acl.tb_usuario_login usu ON usu.ds_login = ti.actorid_
                INNER JOIN core.tb_processo tp ON tp.id_processo = tpi.id_processo
            WHERE
                tp.nr_processo = :nrProcesso
            ORDER BY
                ti.create_
            """, nativeQuery = true)
    List<Object[]> findTaskInstancesByNrProcesso(@Param("nrProcesso") String nrProcesso);
}
