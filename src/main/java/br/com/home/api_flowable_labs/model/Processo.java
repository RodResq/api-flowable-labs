package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
    name = "tb_processo",
    schema = "core",
    uniqueConstraints = @UniqueConstraint(name = "unq_tb_processo_proc_pg", columnNames = {"id_sessao_pg", "id_pk_tb_processo_pg"})
)
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_processo")
    @SequenceGenerator(name = "sq_tb_processo", sequenceName = "core.sq_tb_processo", allocationSize = 1)
    @Column(name = "id_processo")
    private Long idProcesso;

    @Column(name = "nr_processo", length = 30)
    private String nrProcesso;

    @Column(name = "nr_processo_origem", length = 30)
    private String nrProcessoOrigem;

    @Column(name = "ds_complemento", length = 100)
    private String dsComplemento;

    @Column(name = "dt_inicio", nullable = false)
    private LocalDateTime dtInicio;

    @Column(name = "id_fluxo")
    private Long idFluxo;

    @Column(name = "id_usuario_bloqueio")
    private Long idUsuarioBloqueio;

    @Column(name = "id_usuario_cadastro_processo")
    private Long idUsuarioCadastroProcesso;

    @Column(name = "id_jbpm")
    private Long idJbpm;

    @Column(name = "dt_fim")
    private LocalDateTime dtFim;

    @Column(name = "nr_duracao")
    private Long nrDuracao;

    @Column(name = "nm_actor_id", length = 150)
    private String nmActorId;

    @Column(name = "id_caixa")
    private Long idCaixa;

    @Column(name = "id_status")
    private Long idStatus;

    @Column(name = "ds_nm_usu_cadastro_processo", length = 100)
    private String dsNmUsuCadastroProcesso;

    @Column(name = "id_pk_tb_processo_pg")
    private Long idPkTbProcessoPg;

    @Column(name = "id_sessao_pg")
    private Long idSessaoPg;

    @Column(name = "nr_processo_temp", length = 30)
    private String nrProcessoTemp;

    public Processo() {
    }

    public Long getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(Long idProcesso) {
        this.idProcesso = idProcesso;
    }

    public String getNrProcesso() {
        return nrProcesso;
    }

    public void setNrProcesso(String nrProcesso) {
        this.nrProcesso = nrProcesso;
    }

    public String getNrProcessoOrigem() {
        return nrProcessoOrigem;
    }

    public void setNrProcessoOrigem(String nrProcessoOrigem) {
        this.nrProcessoOrigem = nrProcessoOrigem;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public LocalDateTime getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDateTime dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Long getIdFluxo() {
        return idFluxo;
    }

    public void setIdFluxo(Long idFluxo) {
        this.idFluxo = idFluxo;
    }

    public Long getIdUsuarioBloqueio() {
        return idUsuarioBloqueio;
    }

    public void setIdUsuarioBloqueio(Long idUsuarioBloqueio) {
        this.idUsuarioBloqueio = idUsuarioBloqueio;
    }

    public Long getIdUsuarioCadastroProcesso() {
        return idUsuarioCadastroProcesso;
    }

    public void setIdUsuarioCadastroProcesso(Long idUsuarioCadastroProcesso) {
        this.idUsuarioCadastroProcesso = idUsuarioCadastroProcesso;
    }

    public Long getIdJbpm() {
        return idJbpm;
    }

    public void setIdJbpm(Long idJbpm) {
        this.idJbpm = idJbpm;
    }

    public LocalDateTime getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDateTime dtFim) {
        this.dtFim = dtFim;
    }

    public Long getNrDuracao() {
        return nrDuracao;
    }

    public void setNrDuracao(Long nrDuracao) {
        this.nrDuracao = nrDuracao;
    }

    public String getNmActorId() {
        return nmActorId;
    }

    public void setNmActorId(String nmActorId) {
        this.nmActorId = nmActorId;
    }

    public Long getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(Long idCaixa) {
        this.idCaixa = idCaixa;
    }

    public Long getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Long idStatus) {
        this.idStatus = idStatus;
    }

    public String getDsNmUsuCadastroProcesso() {
        return dsNmUsuCadastroProcesso;
    }

    public void setDsNmUsuCadastroProcesso(String dsNmUsuCadastroProcesso) {
        this.dsNmUsuCadastroProcesso = dsNmUsuCadastroProcesso;
    }

    public Long getIdPkTbProcessoPg() {
        return idPkTbProcessoPg;
    }

    public void setIdPkTbProcessoPg(Long idPkTbProcessoPg) {
        this.idPkTbProcessoPg = idPkTbProcessoPg;
    }

    public Long getIdSessaoPg() {
        return idSessaoPg;
    }

    public void setIdSessaoPg(Long idSessaoPg) {
        this.idSessaoPg = idSessaoPg;
    }

    public String getNrProcessoTemp() {
        return nrProcessoTemp;
    }

    public void setNrProcessoTemp(String nrProcessoTemp) {
        this.nrProcessoTemp = nrProcessoTemp;
    }
}
