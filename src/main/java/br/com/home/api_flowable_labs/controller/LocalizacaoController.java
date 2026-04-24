package br.com.home.api_flowable_labs.controller;

import br.com.home.api_flowable_labs.dto.LocalizacaoProjection;
import br.com.home.api_flowable_labs.repository.LocalizacaoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/localizacoes")
public class LocalizacaoController {

    private final LocalizacaoRepository localizacaoRepository;

    public LocalizacaoController(LocalizacaoRepository localizacaoRepository) {
        this.localizacaoRepository = localizacaoRepository;
    }

    @PostMapping("/buscar")
    public ResponseEntity<List<LocalizacaoProjection>> buscarPorIds(@RequestBody List<Long> ids) {
        return ResponseEntity.ok(localizacaoRepository.findByIdLocalizacaoIn(ids));
    }
}
