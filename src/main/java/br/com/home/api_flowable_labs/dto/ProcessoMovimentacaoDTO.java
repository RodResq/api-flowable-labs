package br.com.home.api_flowable_labs.dto;

import java.math.BigInteger;

public class ProcessoMovimentacaoDTO {

    private String nrProcesso;
    private Long idProcessDefinition;
    private String nmFluxo;
    private Long idProcessInstance;
    private String nmTarefa;
    private Boolean isOpen;

    public ProcessoMovimentacaoDTO(String nrProcesso, Long idProcessDefinition, String nmFluxo, Long idProcessInstance,
                                   String nmTarefa, Boolean isOpen) {
        this.nrProcesso = nrProcesso;
        this.idProcessDefinition = idProcessDefinition;
        this.nmFluxo = nmFluxo;
        this.idProcessInstance = idProcessInstance;
        this.nmTarefa = nmTarefa;
        this.isOpen = isOpen;
    }

    public String getNrProcesso() {
        return nrProcesso;
    }

    public Long getIdProcessDefinition() {
        return idProcessDefinition;
    }

    public Long getIdProcessInstance() {
        return idProcessInstance;
    }

    public String getNmFluxo() {
        return nmFluxo;
    }

    public String getNmTarefa() {
        return nmTarefa;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }
}
