package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.model.ProcessoTrf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessoTrfRepository extends JpaRepository<ProcessoTrf, Long> {
}
