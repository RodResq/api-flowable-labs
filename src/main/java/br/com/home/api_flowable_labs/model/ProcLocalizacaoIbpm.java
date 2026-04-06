package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_proc_localizacao_ibpm", schema = "core")
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

    public ProcLocalizacaoIbpm() {
    }

    public Long getIdProcessoLocalizacao() {
        return idProcessoLocalizacao;
    }

    public void setIdProcessoLocalizacao(Long idProcessoLocalizacao) {
        this.idProcessoLocalizacao = idProcessoLocalizacao;
    }

    public Long getIdTaskJbpm() {
        return idTaskJbpm;
    }

    public void setIdTaskJbpm(Long idTaskJbpm) {
        this.idTaskJbpm = idTaskJbpm;
    }

    public Long getIdProcessinstanceJbpm() {
        return idProcessinstanceJbpm;
    }

    public void setIdProcessinstanceJbpm(Long idProcessinstanceJbpm) {
        this.idProcessinstanceJbpm = idProcessinstanceJbpm;
    }

    public Long getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(Long idProcesso) {
        this.idProcesso = idProcesso;
    }

    public Long getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Long idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Long getIdPapel() {
        return idPapel;
    }

    public void setIdPapel(Long idPapel) {
        this.idPapel = idPapel;
    }
}
