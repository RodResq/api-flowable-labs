package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.dto.ProcessoMovimentoProjection;
import br.com.home.api_flowable_labs.model.Fluxo;
import br.com.home.api_flowable_labs.repository.FluxoRepository;
import br.com.home.api_flowable_labs.service.FluxoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fluxos")
public class PjeFluxoController {

    private final FluxoService fluxoService;
    private final FluxoRepository fluxoRepository;

    public PjeFluxoController(FluxoService fluxoService, FluxoRepository fluxoRepository) {
        this.fluxoService = fluxoService;
        this.fluxoRepository = fluxoRepository;
    }

    @GetMapping
    public ResponseEntity<List<Fluxo>> listar() {
        return ResponseEntity.ok(fluxoService.listar());
    }

    @GetMapping("/pesquisar")
    public ResponseEntity<Fluxo> pesquisar(@RequestParam String dsFluxo) {
        return fluxoService.pesquisar(dsFluxo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/processos")
    public ResponseEntity<List<ProcessoMovimentoProjection>> listarProcessosEmAndamento(@RequestParam String nmFluxo) {
        List<ProcessoMovimentoProjection> result = fluxoRepository.findMovimentacoesProcessosPorFluxo(nmFluxo);
        return ResponseEntity.ok(result);
    }

}
