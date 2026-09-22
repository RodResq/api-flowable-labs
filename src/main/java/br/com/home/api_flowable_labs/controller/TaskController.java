package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.dto.VariableInstanceProjection;
import br.com.home.api_flowable_labs.model.JbpmAction;
import br.com.home.api_flowable_labs.model.JbpmVariableAccess;
import br.com.home.api_flowable_labs.repository.EventsRepository;
import br.com.home.api_flowable_labs.repository.JbpmVariableAccessRespository;
import br.com.home.api_flowable_labs.repository.JbpmVariableInstanceRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final JbpmVariableAccessRespository jbpmVariableAccessRespository;
    private final JbpmVariableInstanceRepository jbpmVariableInstanceRepository;
    private final EventsRepository eventsRepository;

    public TaskController(JbpmVariableAccessRespository jbpmVariableAccessRespository,
                           JbpmVariableInstanceRepository jbpmVariableInstanceRepository,
                           EventsRepository eventsRepository) {
        this.jbpmVariableAccessRespository = jbpmVariableAccessRespository;
        this.jbpmVariableInstanceRepository = jbpmVariableInstanceRepository;
        this.eventsRepository = eventsRepository;
    }

    @GetMapping("/{idTaskController}/variable-access")
    public ResponseEntity<List<JbpmVariableAccess>> listarVariableAccess(
            @PathVariable Long idTaskController) {
        return ResponseEntity.ok(jbpmVariableAccessRespository.findByTaskController(idTaskController));
    }

    @GetMapping("{idProcessInstance}/variable-instance")
    public ResponseEntity<List<VariableInstanceProjection>> getVariableInstanceByTaskInstance(@PathVariable Long idProcessInstance) {
        return ResponseEntity.ok(jbpmVariableInstanceRepository.findByProcessInstance(idProcessInstance));
    }

    @GetMapping("/events")
    public ResponseEntity<List<JbpmAction>> listarEventsDoNode(
            @RequestParam Long idProcessDefinition,
            @RequestParam Long idNode) {
        return ResponseEntity.ok(eventsRepository.findEventsByProcessDefinitionAndNode(idProcessDefinition, idNode));
    }
}
