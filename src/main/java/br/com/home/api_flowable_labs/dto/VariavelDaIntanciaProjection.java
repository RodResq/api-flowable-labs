package br.com.home.api_flowable_labs.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface VariavelDaIntanciaProjection {
    Long getIdVariableIntance();
    String getClassJbpmVariableInstance();
    String getName();
    Long getIdToken();
    Long getIdTokenVariableMap();
    Long getIdProcessInstance();
    Long getIdByteArrayValue();
    LocalDateTime getDateValue();
    BigDecimal getDoubleValue();
    Long getLongIdClass();
    Long getLongValue();
    Long getIdTaskInstance();
    Long getIdJbpmToken();
    LocalDateTime getStartJbpmToken();
    LocalDateTime getEndJbpmToken();
    LocalDateTime getDateNodeEnter();
    Long getIdNode();
}
