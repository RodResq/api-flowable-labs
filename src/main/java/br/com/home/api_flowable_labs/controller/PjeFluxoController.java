package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.model.Fluxo;
import br.com.home.api_flowable_labs.service.FluxoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fluxos")
public class PjeFluxoController {

    private final FluxoService fluxoService;

    public PjeFluxoController(FluxoService fluxoService) {
        this.fluxoService = fluxoService;
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
}
