package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.model.Fluxo;
import br.com.home.api_flowable_labs.repository.FluxoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fluxos")
public class PjeFluxoController {

    private final FluxoRepository fluxoRepository;

    public PjeFluxoController(FluxoRepository fluxoRepository) {
        this.fluxoRepository = fluxoRepository;
    }

    @GetMapping
    public ResponseEntity<List<Fluxo>> listar() {
        return ResponseEntity.ok(fluxoRepository.findAll());
    }
}
