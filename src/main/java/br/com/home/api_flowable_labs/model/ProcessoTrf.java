package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_processo_trf", schema = "client")
@Immutable
@Getter
@NoArgsConstructor
public class ProcessoTrf implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id_processo_trf")
    private Long idProcessoTrf;

    @Column(name = "id_classe_judicial")
    private Long idClasseJudicial;

    @Column(name = "id_cl_judicial_outra_instancia")
    private Long idClasseJudicialOutraInstancia;

    @Column(name = "id_jurisdicao")
    private Long idJurisdicao;

    @Column(name = "id_orgao_julgador")
    private Long idOrgaoJulgador;

    @Column(name = "id_orgao_julgador_revisor")
    private Long idOrgaoJulgadorRevisor;

    @Column(name = "id_orgao_julgador_colegiado")
    private Long idOrgaoJulgadorColegiado;

    @Column(name = "id_orgao_julgador_cargo")
    private Long idOrgaoJulgadorCargo;

    @Column(name = "id_localizacao_inicial")
    private Long idLocalizacaoInicial;

    @Column(name = "id_estrutura_inicial")
    private Long idEstruturaInicial;

    @Column(name = "id_municipio_fato_principal")
    private Long idMunicipioFatoPrincipal;

    @Column(name = "id_pessoa_relator_processo")
    private Long idPessoaRelator;

    @Column(name = "id_pessoa_marcou_revisado")
    private Long idPessoaMarcouRevisado;

    @Column(name = "id_pessoa_marcou_pauta")
    private Long idPessoaMarcouPauta;

    @Column(name = "id_pessoa_marcou_julgamento")
    private Long idPessoaMarcouJulgamento;

    @Column(name = "id_pes_apreciou_jus_gratuita")
    private Long idPessoaApreciouJusticaGratuita;

    @Column(name = "id_cargo")
    private Long idCargo;

    @Column(name = "id_endereco_wsdl")
    private Long idEnderecoWsdl;

    @Column(name = "id_sessao_sugerida")
    private Long idSessaoSugerida;

    @Column(name = "id_competencia")
    private Long idCompetencia;

    @Column(name = "id_proc_referencia")
    private Long idProcessoReferencia;

    @Column(name = "id_area_direito")
    private Long idAreaDireito;

    @Column(name = "nr_sequencia")
    private Integer numeroSequencia;

    @Column(name = "nr_ano")
    private Integer ano;

    @Column(name = "nr_digito_verificador")
    private Integer numeroDigitoVerificador;

    @Column(name = "nr_identificacao_orgao_justica")
    private Integer numeroOrgaoJustica;

    @Column(name = "nr_origem_processo")
    private Integer numeroOrigem;

    @Column(name = "cd_nivel_acesso", nullable = false)
    private Integer nivelAcesso;

    @Column(name = "vl_causa")
    private Double valorCausa;

    @Column(name = "vl_peso_processual")
    private Double valorPesoProcessual;

    @Column(name = "vl_peso_distribuicao")
    private Double valorPesoDistribuicao;

    @Column(name = "dt_autuacao")
    private LocalDateTime dataAutuacao;

    @Column(name = "dt_transitado_julgado")
    private LocalDateTime dtTransitadoJulgado;

    @Column(name = "dt_solicitacao_inclusao_pauta")
    private LocalDateTime dtSolicitacaoInclusaoPauta;

    @Column(name = "dt_distribuicao")
    private LocalDateTime dataDistribuicao;

    @Column(name = "dt_vinculacao_revisor")
    private LocalDateTime dataVinculacaoRevisor;

    @Column(name = "dt_vinculacao_relator")
    private LocalDateTime dataVinculacaoRelator;

    @Column(name = "dt_sugestao_sessao")
    private LocalDateTime dataSugestaoSessao;

    @Column(name = "in_segredo_justica")
    private Boolean segredoJustica;

    @Column(name = "in_justica_gratuita")
    private Boolean justicaGratuita;

    @Column(name = "in_solicitado_juizo_100_digital", nullable = false)
    private Boolean solicitadoJuizo100PorCentoDigital;

    @Column(name = "in_tutela_liminar")
    private Boolean tutelaLiminar;

    @Column(name = "in_apreciado_tutela_liminar")
    private Boolean apreciadoTutelaLiminar;

    @Column(name = "in_incidente")
    private Boolean incidente;

    @Column(name = "in_selecionado_pauta", nullable = false)
    private Boolean selecionadoPauta;

    @Column(name = "in_revisado", nullable = false)
    private Boolean revisado;

    @Column(name = "in_selecionado_julgamento", nullable = false)
    private Boolean selecionadoJulgamento;

    @Column(name = "in_outra_instancia", nullable = false)
    private Boolean outraInstancia;

    @Column(name = "in_bloqueia_peticao", nullable = false)
    private Boolean bloqueiaPeticao;

    @Column(name = "in_apreciado_justica_gratuita", nullable = false)
    private Boolean apreciadoJusticaGratuita;

    @Column(name = "in_pronto_revisao")
    private Boolean prontoRevisao;

    @Column(name = "in_mandado_devolvido", nullable = false)
    private Boolean mandadoDevolvido;

    @Column(name = "in_deve_marcar_audiencia", nullable = false)
    private Boolean deveMarcarAudiencia;

    @Column(name = "in_exige_revisor")
    private Boolean exigeRevisor;

    @Column(name = "in_pauta_virtual")
    private Boolean pautaVirtual;

    @Column(name = "in_violacao_faixa_valores")
    private Character violacaoFaixaValoresCompetencia;

    @Column(name = "nr_instancia")
    private Character instancia;

    @Column(name = "in_inicial", length = 1)
    private String inicial;

    @Column(name = "cd_processo_status", length = 1)
    private String processoStatus;

    @Column(name = "in_apreciado_segredo", length = 1)
    private String apreciadoSegredo;

    @Column(name = "in_apreciado_sigilo", length = 1)
    private String apreciadoSigilo;

    @Column(name = "tp_composicao_julgamento", length = 1)
    private String composicaoJulgamento;

    @Column(name = "tp_situacao_guia_recolhimento", length = 2)
    private String situacaoGuiaRecolhimento;

    @Column(name = "ds_observacao_segredo", length = 100)
    private String observacaoSegredo;

    @Column(name = "ds_proc_referencia", length = 50)
    private String desProcReferencia;

    @Column(name = "ds_objeto", length = 3000)
    private String objeto;

    @Column(name = "nr_documento_custa_inicial", length = 14)
    private String documentoCusta;

    @Column(name = "in_tipo_justica", length = 30, nullable = false)
    private String tipoJustica;

    @Column(name = "in_situacao_migracao", length = 30, nullable = false)
    private String situacaoMigracao;

    @Column(name = "in_natureza", length = 30, nullable = false)
    private String natureza;

}
