package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_proc_localizacao_ibpm", schema = "core")
@Getter
@NoArgsConstructor
public class ProcLocalizacaoIbpm {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_proc_localizacao_ibpm")
    @SequenceGenerator(name = "sq_tb_proc_localizacao_ibpm", sequenceName = "core.sq_tb_proc_localizacao_ibpm", allocationSize = 1)
    @Column(name = "id_processo_localizacao")
    private Long idProcessoLocalizacao;

    @Column(name = "id_task_jbpm")
    private Long idTaskJbpm;

    @Column(name = "id_processinstance_jbpm")
    private Long idProcessinstanceJbpm;

    @Column(name = "id_processo")
    private Long idProcesso;

    @Column(name = "id_localizacao")
    private Long idLocalizacao;

    @Column(name = "id_papel")
    private Long idPapel;

}
