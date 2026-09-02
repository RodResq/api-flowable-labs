package br.com.home.api_flowable_labs.dto;

public interface AcaoDoNodeProjection {

    Long getIdAction();
    String getNameAction();
    String getExpressionAction();
    Long getIdEvent();
    String getEventType();
    Long getIdTask();
    Long getIdNode();
    String getNameNode();
    String getDescriptionNode();
    String getDecisionexpressionNode();
    Boolean getEndtasksNode();
}
