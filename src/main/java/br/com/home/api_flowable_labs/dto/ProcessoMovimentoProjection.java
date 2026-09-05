package br.com.home.api_flowable_labs.dto;

public interface ProcessoMovimentoProjection {

    String getNrProcesso();
    Long getIdProcessDefinition();
    String getNmFluxo();
    Long getIdProcessInstance();
    String getNmTarefa();
    Long getIdNode();
    Long getIdToken();
    Long getIdTaskInstance();
    Boolean getIsOpen();
}
