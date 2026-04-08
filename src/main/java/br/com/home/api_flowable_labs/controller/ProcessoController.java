package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.dto.TaskInstanceDTO;
import br.com.home.api_flowable_labs.model.JbpmVariableInstance;
import br.com.home.api_flowable_labs.model.Processo;
import br.com.home.api_flowable_labs.repository.JbpmVariableInstanceRepository;
import br.com.home.api_flowable_labs.repository.ProcessoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/processos")
public class ProcessoController {

    private final ProcessoRepository processoRepository;
    private final JbpmVariableInstanceRepository jbpmVariableInstanceRepository;

    public ProcessoController(ProcessoRepository processoRepository,
                              JbpmVariableInstanceRepository jbpmVariableInstanceRepository) {
        this.processoRepository = processoRepository;
        this.jbpmVariableInstanceRepository = jbpmVariableInstanceRepository;
    }

    @GetMapping
    public ResponseEntity<Page<Processo>> listar(@PageableDefault(size = 20) Pageable pageable) {
        return ResponseEntity.ok(processoRepository.findAllDistinct(pageable));
    }

    @GetMapping("/tarefas")
    public ResponseEntity<List<TaskInstanceDTO>> listarTarefas(@RequestParam String nrProcesso) {
        List<TaskInstanceDTO> result = processoRepository.findTaskInstancesByNrProcesso(nrProcesso)
                .stream()
                .map(row -> new TaskInstanceDTO(
                        row[0] != null ? ((Number) row[0]).longValue() : null,
                        (String) row[1],
                        row[2] != null ? ((java.sql.Timestamp) row[2]).toLocalDateTime() : null,
                        row[3] != null ? ((java.sql.Timestamp) row[3]).toLocalDateTime() : null,
                        row[4] != null ? ((Number) row[4]).longValue() : null,
                        (String) row[5],
                        (Boolean) row[6],
                        (String) row[7],
                        (Long) row[8],
                        (Long) row[9],
                        (String) row[10]
                ))
                .toList();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{idProcessoInstance}/tarefas/{idTaskInstance}/variaveis")
    public ResponseEntity<List<JbpmVariableInstance>> listarVariaveis(
            @PathVariable Long idProcessoInstance,
            @PathVariable Long idTaskInstance) {
        return ResponseEntity.ok(
                jbpmVariableInstanceRepository.findByProcessInstanceAndTaskInstanceId(idProcessoInstance, idTaskInstance)
        );
    }
}
