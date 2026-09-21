package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.dto.VariavelDaIntanciaProjection;
import br.com.home.api_flowable_labs.model.JbpmVariableInstance;
import br.com.home.api_flowable_labs.repository.JbpmVariableInstanceRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("variables")
public class VariableController {

    private final JbpmVariableInstanceRepository jbpmVariableInstanceRepository;

    public VariableController(JbpmVariableInstanceRepository jbpmVariableInstanceRepository) {
        this.jbpmVariableInstanceRepository = jbpmVariableInstanceRepository;
    }

    @GetMapping("/process-instance/{idProcessInstance}/anteriores")
    public ResponseEntity<List<JbpmVariableInstance>> listarVariaveisPorProcessInstanceFAnteriores(
            @PathVariable("idProcessInstance") Long idProcessInstance) {
        return ResponseEntity.ok(
                jbpmVariableInstanceRepository.findByProcessInstanceAndTaskInstanceIsNull(idProcessInstance)
        );
    }

    @GetMapping("/process-instance/{idProcessInstance}/task/{idTaskInstance}")
    public ResponseEntity<List<JbpmVariableInstance>> listarVariaveis(
            @PathVariable Long idProcessInstance,
            @PathVariable Long idTaskInstance) {
        return ResponseEntity.ok(
                jbpmVariableInstanceRepository.findByProcessInstanceAndTaskInstanceId(idProcessInstance, idTaskInstance)
        );
    }

    @GetMapping("/process-instance/{idProcessInstance}/token/{idToken}")
    public ResponseEntity<List<VariavelDaIntanciaProjection>> buscarVariaveisDaInstancia(
            @PathParam("idProcessInstance") Long idProcessInstance, @PathParam("idToken") Long idToken) {

        return ResponseEntity.ok(jbpmVariableInstanceRepository.findVariavelsDaIntsancia(idProcessInstance, idToken));
    }



}
