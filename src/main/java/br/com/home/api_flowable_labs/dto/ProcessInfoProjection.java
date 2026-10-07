package br.com.home.api_flowable_labs.dto;

import java.time.LocalDateTime;

public interface ProcessInfoProjection {
    Long getIdProcessoTrf();
    String getNrProcesso();
    String getDsProcReferencia();
    Boolean getBloqueado();

    Boolean getInSegredoJustica();
    String getInApreciadoSegredoJustica();

    Boolean getInTutelaLiminar();
    Boolean getInApreciadoTutelaLiminar();

    Boolean getInJusticaGratuita();
    Boolean getInApreciadoJusticaGratuita();

    Boolean getPossuiConexao();

    LocalDateTime getDtAutuacao();

    Long getIdJurisdicao();
    String getDsJurisdicao();

    Long getIdOrgaoJulgador();
    String getDsOrgaoJulgador();

    Long getIdOrgaoJulgadorColegiado();
    String getDsOrgaoJulgadorColegiado();

    Long getIdClasseJudicial();
    Integer getCdClasseJudicial();
    String getClasseJudicial();

    Long getIdCompetencia();
    String getDsCompetencia();

    Long getIdAreaDireito();
    String getDsAreaDireito();

    String getIdAssuntoTrf();
    String getAssuntoTrf();
    String getNmTarefa();

    Integer getNrSequencia();
    Integer getNrDigitoVerificador();
    Integer getNrAno();
    Integer getNrIdentificacaoOrgaoJustica();
    Integer getNrOrigemProcesso();
    Long getIdLocalizacaoInicial();

    Boolean getEhPlantaoJudicial();

}
