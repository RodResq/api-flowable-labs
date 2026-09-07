package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.model.JbpmVariableAccess;
import br.com.home.api_flowable_labs.repository.JbpmVariableAccessRespository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final JbpmVariableAccessRespository jbpmVariableAccessRespository;

    public TaskController(JbpmVariableAccessRespository jbpmVariableAccessRespository) {
        this.jbpmVariableAccessRespository = jbpmVariableAccessRespository;
    }

    @GetMapping("/{idTaskController}/variable-access")
    public ResponseEntity<List<JbpmVariableAccess>> listarVariableAccess(
            @PathVariable Long idTaskController) {
        return ResponseEntity.ok(jbpmVariableAccessRespository.findByTaskController(idTaskController));
    }
}
