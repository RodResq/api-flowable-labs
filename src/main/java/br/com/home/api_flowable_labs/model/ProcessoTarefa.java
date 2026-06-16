package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_processo_tarefa", schema = "client")
@Getter
@NoArgsConstructor
public class ProcessoTarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_processo_tarefa")
    @SequenceGenerator(name = "sq_tb_processo_tarefa", sequenceName = "client.sq_tb_processo_tarefa", allocationSize = 1)
    @Column(name = "id_processo_tarefa")
    private Long idProcessoTarefa;

    @Column(name = "nm_tarefa", length = 255)
    private String nmTarefa;

    @Column(name = "id_processo_trf")
    private Long idProcessoTrf;

    @Column(name = "id_task")
    private Long idTask;

    @Column(name = "id_localizacao")
    private Long idLocalizacao;

    @Column(name = "id_orgao_julgador_colegiado")
    private Long idOrgaoJulgadorColegiado;

}
