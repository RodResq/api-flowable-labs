package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.model.JbpmAction;
import br.com.home.api_flowable_labs.model.JbpmVariableAccess;
import br.com.home.api_flowable_labs.repository.EventsRepository;
import br.com.home.api_flowable_labs.repository.JbpmVariableAccessRespository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final JbpmVariableAccessRespository jbpmVariableAccessRespository;
    private final EventsRepository eventsRepository;

    public TaskController(JbpmVariableAccessRespository jbpmVariableAccessRespository,
                           EventsRepository eventsRepository) {
        this.jbpmVariableAccessRespository = jbpmVariableAccessRespository;
        this.eventsRepository = eventsRepository;
    }

    @GetMapping("/{idTaskController}/variable-access")
    public ResponseEntity<List<JbpmVariableAccess>> listarVariableAccess(
            @PathVariable Long idTaskController) {
        return ResponseEntity.ok(jbpmVariableAccessRespository.findByTaskController(idTaskController));
    }

    @GetMapping("/events")
    public ResponseEntity<List<JbpmAction>> listarEventsDoNode(
            @RequestParam Long idProcessDefinition,
            @RequestParam Long idNode) {
        return ResponseEntity.ok(eventsRepository.findEventsByProcessDefinitionAndNode(idProcessDefinition, idNode));
    }
}
