package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tb_localizacao", schema = "core")
@Getter
@NoArgsConstructor
public class Localizacao implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_localizacao")
    @SequenceGenerator(name = "sq_tb_localizacao", sequenceName = "core.sq_tb_localizacao", allocationSize = 1)
    @Column(name = "id_localizacao")
    private Long idLocalizacao;

    @Column(name = "ds_localizacao", nullable = false, length = 100)
    private String dsLocalizacao;

    @Column(name = "in_ativo", nullable = false)
    private Boolean inAtivo;

    @Column(name = "id_endereco")
    private Long idEndereco;

    @Column(name = "id_localizacao_pai")
    private Long idLocalizacaoPai;

    @Column(name = "id_estrutura")
    private Long idEstrutura;

    @Column(name = "in_estrutura", nullable = false)
    private Boolean inEstrutura;

    @Column(name = "nr_faixa_inferior")
    private Integer nrFaixaInferior;

    @Column(name = "nr_faixa_superior")
    private Integer nrFaixaSuperior;

}
