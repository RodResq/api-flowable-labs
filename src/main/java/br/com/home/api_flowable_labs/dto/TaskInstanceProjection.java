package br.com.home.api_flowable_labs.dto;

import java.time.LocalDateTime;

public interface TaskInstanceProjection {

    Long id();
    String name();
    LocalDateTime create();
    LocalDateTime end();
    Long idUsuario();
    String dsNome();
    Boolean isOpen();
    String nameFluxo();
    Long idTaskInstance();
    Long idProcessInstance();
    Long idJbpmToken();
    Long idJbpmNode();
    String nodeInGraph();
}
