package br.com.home.api_flowable_labs.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface VariableInstanceProjection {

    Long getIdProcessInstance();
    Long getIdTaskInstance();
    Long getIdToken();
    String getName();
    String getClazz();
    String getStringValue();
    LocalDateTime getDateValue();
    BigDecimal getDoubleValue();
}
