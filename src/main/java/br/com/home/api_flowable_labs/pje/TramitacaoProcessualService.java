package br.com.home.api_flowable_labs.pje;

import br.com.home.api_flowable_labs.dto.ProcessoProcessInstanceVO;
import br.com.home.api_flowable_labs.model.ProcessoTrf;
import org.jbpm.graph.def.Transition;
import org.jbpm.graph.exe.ProcessInstance;
import org.jbpm.taskmgmt.exe.TaskInstance;

import java.util.Date;

public interface TramitacaoProcessualService {

    public Object recuperaVariavel(String nome);

    public Object recuperaVariavel(ProcessInstance processInstance, String nome) ;

    public void gravaVariavel(String nome, Object value);

    public Object recuperaVariavelTarefa(String nome);

    public Object recuperaVariavelTarefa(TaskInstance ti, String nome);

    public void gravaVariavelTarefa(String nome, Object value);

    public void apagaVariavel(String nome);

    public void apagaVariavelTarefa(String nome);

    public ProcessoTrf recuperaProcesso(Integer idProcesso);

    public ProcessoProcessInstanceVO recuperaProcessoProcessInstanceVO(Integer idProcesso, Long idProcessInstance);

    public ProcessoTrf recuperaProcesso();

    public boolean temUrgencia();

    public boolean temUrgencia(Integer idProcesso);

    public boolean sigiloso();

    public boolean sigiloso(Integer idProcesso);

    public boolean temAssunto(Integer codigoAssunto);

    public boolean temAssunto(Integer idProcesso, Integer codigoAssunto);

    public boolean temAssuntoDoGrupo(String idGrupo);

    public boolean temAssuntoDoGrupo(Integer idProcesso, String idGrupo);

    public boolean temMovimento(String codigoMovimento);

    public boolean temMovimento(Integer idProcesso, String codigoMovimento);

    public boolean temMovimento(String codigoMovimento, Date dataLimite);

    public boolean temMovimento(Integer idProcesso, String codigoMovimento, Date dataLimite);

    public boolean temMovimento(String codigoMovimento, Date dataLimite, String...complementos);

    public boolean temMovimento(Integer idProcesso, String codigoMovimento, Date dataLimite, String...complementos);

    public boolean temMovimentoDoGrupo(String idGrupo);

    public boolean temMovimentoDoGrupo(Integer idProcesso, String idGrupo);

    public boolean temMovimentoDoGrupo(String idGrupo, Date dataLimite);

    public boolean temMovimentoDoGrupo(Integer idProcesso, String idGrupo, Date dataLimite);

    public int contagemPreventoPendentes();

    public int contagemPreventoPendentes(Integer idProcesso);

    public boolean deslocarFluxoParaOrgaoDiverso();

    public boolean deslocarFluxoParaOrgaoDiverso(Integer idProcessoJudicial, Integer idOrgao, Integer idCargoJudicial, Integer idColegiado);

    public boolean deslocarFluxoParaOrgaoDiverso(Integer idProcesso);

    public void acrescentarSituacao(String codigoTipoSituacao);

    public void acrescentarSituacao(Integer idProcesso, String codigoTipoSituacao);

    public void acrescentarSituacao(ProcessoTrf processo, String codigoTipoSituacao);

    public void removerSituacao(String codigoTipoSituacao);

    public void removerSituacao(Integer idProcesso, String codigoTipoSituacao);

    public void removerSituacao(ProcessoTrf processo, String codigoTipoSituacao);

    public boolean temSituacao(String codigoSituacao);

    public boolean temSituacao(Integer idProcesso, String codigoSituacao);

    public boolean temSituacao(ProcessoTrf processo, String codigoSituacao);

    public boolean temSituacao(ProcessoTrf processo, String codigoSituacao, Date dataReferencia);

    public boolean deslocarFluxoParaOrgaoVista();

    public boolean registrarOrgaoVencedor();

    public Transition recuperarTransicaoPadrao(TaskInstance taskInstance);

    public boolean magistradoRelatorVencedor();

    public boolean votoRelatorAssinado();

    public Boolean isProcessInstanceNula();

    public Boolean isTransicaoDispensaRequeridos(String transition);

    public void setTaskInstance(TaskInstance taskInstance);

    public boolean isNullTaskInstance();

    public boolean contemVariavel(String nome);

    /**
     * Movimenta o processo para a transição definida
     *
     * @param transition tarefa destino
     */
    public void movimentarProcessoJudicial(String transition);

    /**
     * Indica se o ultimo julgamento do processo foi de acordo com os parametros:
     * 'M' - de Mérito
     * 'P' - de Preliminar
     *
     * @param ProcessoTrf - processoTrf
     * @param String - letra 'M' ou 'P'
     * @return true, se o ultimo julgamento for do tipo da letra informado
     *
     *  @throws IllegalArgumentException, caso o identificador dado não seja as letras M ou P
     */
    public boolean ultimoJulgamentoTipo(ProcessoTrf processoTrf, String letra);

    /**
     * Indica se o ultimo julgamento do processo foi de acordo com os parametros:
     * 'M' - de Mérito
     * 'P' - de Preliminar
     *
     * @param String - letra 'M' ou 'P'
     * @return true, se o ultimo julgamento for do tipo da letra informado
     *
     *  @throws IllegalArgumentException, caso o identificador dado não seja as letras M ou P
     */
    public boolean ultimoJulgamentoTipo(String letra);

    /**
     * Envia email comunicando a distribuicao do processo aos servidores de plantao
     *
     */
    public void comunicarDistribuicaoProcessoPlantao();

    public ProcessInstance getProcessInstance_();

    public void confirmaRecebimento(String nrProcesso);

    public void juntaProtocoloAoProcesso(String orgaoDestino);

    public void suspenderProcessoPSE();

    public void reativarProcessoPSE();
}
