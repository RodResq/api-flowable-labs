package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_processo_tarefa", schema = "client")
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

    public ProcessoTarefa() {
    }

    public Long getIdProcessoTarefa() {
        return idProcessoTarefa;
    }

    public void setIdProcessoTarefa(Long idProcessoTarefa) {
        this.idProcessoTarefa = idProcessoTarefa;
    }

    public String getNmTarefa() {
        return nmTarefa;
    }

    public void setNmTarefa(String nmTarefa) {
        this.nmTarefa = nmTarefa;
    }

    public Long getIdProcessoTrf() {
        return idProcessoTrf;
    }

    public void setIdProcessoTrf(Long idProcessoTrf) {
        this.idProcessoTrf = idProcessoTrf;
    }

    public Long getIdTask() {
        return idTask;
    }

    public void setIdTask(Long idTask) {
        this.idTask = idTask;
    }

    public Long getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Long idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Long getIdOrgaoJulgadorColegiado() {
        return idOrgaoJulgadorColegiado;
    }

    public void setIdOrgaoJulgadorColegiado(Long idOrgaoJulgadorColegiado) {
        this.idOrgaoJulgadorColegiado = idOrgaoJulgadorColegiado;
    }
}
