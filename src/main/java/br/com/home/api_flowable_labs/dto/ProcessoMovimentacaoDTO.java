package br.com.home.api_flowable_labs.dto;

public class ProcessoMovimentacaoDTO {

    private String nrProcesso;
    private String nmFluxo;
    private String nmTarefa;
    private Boolean isOpen;

    public ProcessoMovimentacaoDTO(String nrProcesso, String nmFluxo, String nmTarefa, Boolean isOpen) {
        this.nrProcesso = nrProcesso;
        this.nmFluxo = nmFluxo;
        this.nmTarefa = nmTarefa;
        this.isOpen = isOpen;
    }

    public String getNrProcesso() {
        return nrProcesso;
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
