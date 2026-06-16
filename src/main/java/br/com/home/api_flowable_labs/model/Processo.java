package br.com.home.api_flowable_labs.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(
    name = "tb_processo",
    schema = "core",
    uniqueConstraints = @UniqueConstraint(name = "unq_tb_processo_proc_pg", columnNames = {"id_sessao_pg", "id_pk_tb_processo_pg"})
)
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Processo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_tb_processo")
    @SequenceGenerator(name = "sq_tb_processo", sequenceName = "core.sq_tb_processo", allocationSize = 1)
    @Column(name = "id_processo")
    private Long idProcesso;

    @Column(name = "nr_processo", length = 30)
    private String nrProcesso;

    @Column(name = "nr_processo_origem", length = 30)
    private String nrProcessoOrigem;

    @Column(name = "ds_complemento", length = 100)
    private String dsComplemento;

    @Column(name = "dt_inicio", nullable = false)
    private LocalDateTime dtInicio;

    @Column(name = "id_fluxo")
    private Long idFluxo;

    @Column(name = "id_usuario_bloqueio")
    private Long idUsuarioBloqueio;

    @Column(name = "id_usuario_cadastro_processo")
    private Long idUsuarioCadastroProcesso;

    @Column(name = "id_jbpm")
    private Long idJbpm;

    @Column(name = "dt_fim")
    private LocalDateTime dtFim;

    @Column(name = "nr_duracao")
    private Long nrDuracao;

    @Column(name = "nm_actor_id", length = 150)
    private String nmActorId;

    @Column(name = "id_caixa")
    private Long idCaixa;

    @Column(name = "id_status")
    private Long idStatus;

    @Column(name = "ds_nm_usu_cadastro_processo", length = 100)
    private String dsNmUsuCadastroProcesso;

    @Column(name = "id_pk_tb_processo_pg")
    private Long idPkTbProcessoPg;

    @Column(name = "id_sessao_pg")
    private Long idSessaoPg;

    @Column(name = "nr_processo_temp", length = 30)
    private String nrProcessoTemp;

}
