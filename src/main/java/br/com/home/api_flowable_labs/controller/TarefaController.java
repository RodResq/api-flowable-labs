package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.dto.PerfilVisualizarTarefaProjection;
import br.com.home.api_flowable_labs.repository.TarefaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaRepository tarefaRepository;

    public TarefaController(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @GetMapping("/{idTarefa}/perfil-visualizar")
    public ResponseEntity<List<PerfilVisualizarTarefaProjection>> listarPerfilVisualizar(
            @PathVariable Long idTarefa) {
        return ResponseEntity.ok(tarefaRepository.findPerfilVisualizarTarefa(idTarefa));
    }
}
