package br.com.home.api_flowable_labs.dto;

import java.time.LocalDateTime;

public interface TaskHistoryProjection {

    Long getIdTaskInstance();
    String getNameTask();
    LocalDateTime getCreateAt();
    LocalDateTime getEndAt();
    Boolean getOpenTask();
    String getNameFlux();
    Long getIdProcessInstance();
}
