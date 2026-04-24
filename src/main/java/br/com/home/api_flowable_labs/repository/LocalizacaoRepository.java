package br.com.home.api_flowable_labs.repository;

import br.com.home.api_flowable_labs.dto.LocalizacaoProjection;
import br.com.home.api_flowable_labs.model.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {

    @Query("SELECT l.idLocalizacao AS idLocalizacao, l.dsLocalizacao AS dsLocalizacao FROM Localizacao l WHERE l.idLocalizacao IN :ids")
    List<LocalizacaoProjection> findByIdLocalizacaoIn(@Param("ids") List<Long> ids);
}
