package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tb_localizacao", schema = "core")
public class Localizacao implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_localizacao")
    @SequenceGenerator(name = "sq_tb_localizacao", sequenceName = "core.sq_tb_localizacao", allocationSize = 1)
    @Column(name = "id_localizacao")
    private Long idLocalizacao;

    @Column(name = "ds_localizacao", nullable = false, length = 100)
    private String dsLocalizacao;

    @Column(name = "in_ativo", nullable = false)
    private Boolean inAtivo;

    @Column(name = "id_endereco")
    private Long idEndereco;

    @Column(name = "id_localizacao_pai")
    private Long idLocalizacaoPai;

    @Column(name = "id_estrutura")
    private Long idEstrutura;

    @Column(name = "in_estrutura", nullable = false)
    private Boolean inEstrutura;

    @Column(name = "nr_faixa_inferior")
    private Integer nrFaixaInferior;

    @Column(name = "nr_faixa_superior")
    private Integer nrFaixaSuperior;

    public Localizacao() {
    }

    public Long getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Long idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public String getDsLocalizacao() {
        return dsLocalizacao;
    }

    public void setDsLocalizacao(String dsLocalizacao) {
        this.dsLocalizacao = dsLocalizacao;
    }

    public Boolean getInAtivo() {
        return inAtivo;
    }

    public void setInAtivo(Boolean inAtivo) {
        this.inAtivo = inAtivo;
    }

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Long getIdLocalizacaoPai() {
        return idLocalizacaoPai;
    }

    public void setIdLocalizacaoPai(Long idLocalizacaoPai) {
        this.idLocalizacaoPai = idLocalizacaoPai;
    }

    public Long getIdEstrutura() {
        return idEstrutura;
    }

    public void setIdEstrutura(Long idEstrutura) {
        this.idEstrutura = idEstrutura;
    }

    public Boolean getInEstrutura() {
        return inEstrutura;
    }

    public void setInEstrutura(Boolean inEstrutura) {
        this.inEstrutura = inEstrutura;
    }

    public Integer getNrFaixaInferior() {
        return nrFaixaInferior;
    }

    public void setNrFaixaInferior(Integer nrFaixaInferior) {
        this.nrFaixaInferior = nrFaixaInferior;
    }

    public Integer getNrFaixaSuperior() {
        return nrFaixaSuperior;
    }

    public void setNrFaixaSuperior(Integer nrFaixaSuperior) {
        this.nrFaixaSuperior = nrFaixaSuperior;
    }
}
