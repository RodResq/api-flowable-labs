package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_fluxo", schema = "core")
public class Fluxo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_fluxo")
    @SequenceGenerator(name = "sq_tb_fluxo", sequenceName = "core.sq_tb_fluxo", allocationSize = 1)
    @Column(name = "id_fluxo")
    private Long idFluxo;

    @Column(name = "cd_fluxo", length = 30)
    private String cdFluxo;

    @Column(name = "ds_fluxo", nullable = false, length = 100)
    private String dsFluxo;

    @Column(name = "in_ativo", nullable = false)
    private Boolean inAtivo;

    @Column(name = "qt_prazo")
    private Integer qtPrazo;

    @Column(name = "in_publicado", nullable = false)
    private Boolean inPublicado;

    @Column(name = "dt_inicio_publicacao")
    private LocalDateTime dtInicioPublicacao;

    @Column(name = "dt_fim_publicacao")
    private LocalDateTime dtFimPublicacao;

    @Column(name = "id_usuario_publicacao")
    private Long idUsuarioPublicacao;

    @Column(name = "ds_xml", columnDefinition = "text")
    private String dsXml;

    @Column(name = "dt_ultima_publicacao")
    private LocalDateTime dtUltimaPublicacao;

    public Fluxo() {
    }

    public Long getIdFluxo() {
        return idFluxo;
    }

    public void setIdFluxo(Long idFluxo) {
        this.idFluxo = idFluxo;
    }

    public String getCdFluxo() {
        return cdFluxo;
    }

    public void setCdFluxo(String cdFluxo) {
        this.cdFluxo = cdFluxo;
    }

    public String getDsFluxo() {
        return dsFluxo;
    }

    public void setDsFluxo(String dsFluxo) {
        this.dsFluxo = dsFluxo;
    }

    public Boolean getInAtivo() {
        return inAtivo;
    }

    public void setInAtivo(Boolean inAtivo) {
        this.inAtivo = inAtivo;
    }

    public Integer getQtPrazo() {
        return qtPrazo;
    }

    public void setQtPrazo(Integer qtPrazo) {
        this.qtPrazo = qtPrazo;
    }

    public Boolean getInPublicado() {
        return inPublicado;
    }

    public void setInPublicado(Boolean inPublicado) {
        this.inPublicado = inPublicado;
    }

    public LocalDateTime getDtInicioPublicacao() {
        return dtInicioPublicacao;
    }

    public void setDtInicioPublicacao(LocalDateTime dtInicioPublicacao) {
        this.dtInicioPublicacao = dtInicioPublicacao;
    }

    public LocalDateTime getDtFimPublicacao() {
        return dtFimPublicacao;
    }

    public void setDtFimPublicacao(LocalDateTime dtFimPublicacao) {
        this.dtFimPublicacao = dtFimPublicacao;
    }

    public Long getIdUsuarioPublicacao() {
        return idUsuarioPublicacao;
    }

    public void setIdUsuarioPublicacao(Long idUsuarioPublicacao) {
        this.idUsuarioPublicacao = idUsuarioPublicacao;
    }

    public String getDsXml() {
        return dsXml;
    }

    public void setDsXml(String dsXml) {
        this.dsXml = dsXml;
    }

    public LocalDateTime getDtUltimaPublicacao() {
        return dtUltimaPublicacao;
    }

    public void setDtUltimaPublicacao(LocalDateTime dtUltimaPublicacao) {
        this.dtUltimaPublicacao = dtUltimaPublicacao;
    }
}
