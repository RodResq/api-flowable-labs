package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.model.ProcessoTrf;
import br.com.home.api_flowable_labs.repository.ProcessoTrfRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/processos-trf")
public class ProcessoTrfController {

    private final ProcessoTrfRepository processoTrfRepository;

    public ProcessoTrfController(ProcessoTrfRepository processoTrfRepository) {
        this.processoTrfRepository = processoTrfRepository;
    }

    @GetMapping("/{idProcessoTrf}")
    public ResponseEntity<ProcessoTrf> buscarPorId(@PathVariable Long idProcessoTrf) {
        return processoTrfRepository.findById(idProcessoTrf)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
