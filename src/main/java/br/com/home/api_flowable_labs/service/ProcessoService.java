package br.com.home.api_flowable_labs.service;

import br.com.home.api_flowable_labs.model.Processo;
import br.com.home.api_flowable_labs.repository.ProcessoRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProcessoService {

    private final ProcessoRepository processoRepository;

    public ProcessoService(ProcessoRepository processoRepository) {
        this.processoRepository = processoRepository;
    }

    @Cacheable(value = "processos", key = "#pageable.pageNumber + '-' + #pageable.pageSize + '-' + #pageable.sort")
    public Page<Processo> listar(Pageable pageable) {
        return processoRepository.findAllDistinct(pageable);
    }

    @CacheEvict(value = "processos", allEntries = true)
    public void evictCache() {
        //Chamr quando os dados mudam
    }
}
