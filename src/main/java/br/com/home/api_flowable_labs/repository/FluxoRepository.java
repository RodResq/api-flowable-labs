package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.model.Fluxo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FluxoRepository extends JpaRepository<Fluxo, Long> {

//    Fluxo findBydsFluxo(String descricaoFluxo);
}
