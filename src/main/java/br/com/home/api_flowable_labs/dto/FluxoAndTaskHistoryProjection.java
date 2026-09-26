package br.com.home.api_flowable_labs.dto;

import com.fasterxml.jackson.annotation.JsonRawValue;

public interface FluxoAndTaskHistoryProjection {
    Long getId();
    String getName();
    Long getIdProcInst();
    String getTipoCorrespondencia();

    @JsonRawValue
    String getItens();

}


