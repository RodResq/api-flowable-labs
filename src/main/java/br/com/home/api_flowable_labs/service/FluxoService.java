package br.com.home.api_flowable_labs.service;

import br.com.home.api_flowable_labs.model.Fluxo;
import br.com.home.api_flowable_labs.repository.FluxoRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FluxoService {

    private final FluxoRepository fluxoRepository;

    public FluxoService(FluxoRepository fluxoRepository) {
        this.fluxoRepository = fluxoRepository;
    }

    @Cacheable(value = "fluxos", key = "'listar'")
    public List<Fluxo> listar() {
        return fluxoRepository.findAll();
    }

    @Cacheable(value = "fluxos", key = "#dsFluxo")
    public Optional<Fluxo> pesquisar(String dsFluxo) {
        return fluxoRepository.findByDsFluxo(dsFluxo);
    }

    @CacheEvict(value = "fluxos", allEntries = true)
    public void evictCache() {
    }
}
