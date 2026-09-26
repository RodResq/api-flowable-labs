package br.com.home.api_flowable_labs.dto;

import java.time.LocalDateTime;

public interface VariableHistoryProjection {

    Long getIdAction();
    String getActionExpression();
    Long getIdProcessDefinition();
    String getNameProcessDefinition();
    Long getIdProcessInstance();
    LocalDateTime getStartAt();
    LocalDateTime getEndAt();
}
