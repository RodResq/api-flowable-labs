package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.dto.ProcessoMovimentacaoDTO;
import br.com.home.api_flowable_labs.model.Fluxo;
import br.com.home.api_flowable_labs.repository.FluxoRepository;
import br.com.home.api_flowable_labs.service.FluxoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
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
    public ResponseEntity<List<ProcessoMovimentacaoDTO>> listarProcessosEmAndamento(@RequestParam String nmFluxo) {
        List<ProcessoMovimentacaoDTO> result = fluxoRepository.findMovimentacoesProcessosPorFluxo(nmFluxo)
                .stream()
                .map(row -> new ProcessoMovimentacaoDTO(
                        (String) row[0],
                        (Long) row[1],
                        (String) row[2],
                        (Long) row[3],
                        (String) row[4],
                        (Long) row[5],
                        (Long) row[6],
                        (Boolean) row[7]
                ))
                .toList();
        return ResponseEntity.ok(result);
    }
}
