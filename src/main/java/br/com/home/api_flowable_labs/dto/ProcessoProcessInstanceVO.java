package br.com.home.api_flowable_labs.dto;

public class ProcessoProcessInstanceVO {

    private String numeroProcesso;
    private Long idProcessInstance;

    public ProcessoProcessInstanceVO(String numeroProcesso, Long idProcessInstance) {
        this.numeroProcesso = numeroProcesso;
        this.idProcessInstance = idProcessInstance;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public Long getIdProcessInstance() {
        return idProcessInstance;
    }

    public void setIdProcessInstance(Long idProcessInstance) {
        this.idProcessInstance = idProcessInstance;
    }

}
