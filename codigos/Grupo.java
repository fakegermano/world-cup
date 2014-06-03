import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa um grupo da primeira fase.
 *
 */
public class Grupo {

	/**
	 * Nome do grupo
	 */
	private String nome;
	
	/**
	 * Seleções neste grupo
	 */
	private List<Selecao> selecoes;
	
	/**
	 * Jogos neste grupo.
	 */
	private List<Jogo> jogos;
	
	// TODO contrutor, inicializar variáveis internas
	public Grupo(String nome) {
	}
	
	// TODO adicionar seleção a este grupo
	public void adicionaSelecao(Selecao selecao) {
	}
	
	// TODO retornar o nome deste grupo
	public String getNome() {
	}
	
	// TODO retornar seleções deste grupo, na ordem que foram adicionadas
	public List<Selecao> getSelecoes() {
	}
	// TODO adicionar jogo a este grupo
	// Se pelo menos uma das seleções do jogo não estiver presente no
	// grupo, deve disparar nova exceção CopaException com o tipo JOGO_COM_SELECAO_INVALIDA
	// e mensagem "Selecao nao presente no grupo"
	public void adicionaJogo(Jogo jogo) throws CopaException {
	}

	// TODO Adicionar gol a um jogo deste grupo
	
	// Se pelo menos uma das seleções do gol não estiver presente no
	// grupo, deve disparar nova exceção CopaException com o tipo SELECOES_GOL_NAO_PRESENTES_GRUPO
	// e mensagem "Uma das selecoes indicadas nao pertence a este grupo"
	
	// Se as seleções estiverem presentes, mas não houver nenhum jogo cadastrado para elas,
	// deve disparar nova exceção CopaException com o tipo NENHUM_JOGO_COM_SELECOES_GOL
	// e mensagem "Nenhum jogo com as selecoes indicadas"
	
	// Assuma que no máximo há um jogo para cada par de seleções do grupo
	public void adicionaGol(Gol gol) throws CopaException {
	}
	
	// TODO retornar número de jogos
	public int getNumeroJogos() {
	}

	// TODO retornar uma String com o placar do i-ésimo jogo presente
	// neste grupo (0 <= i < getNumeroJogos())
	
	// O formato do retorno é "SL1 PL1 X PL2 SL2"
	// Onde SL1 e PL1 são o código do país da seleção 1 e gols da seleção 1, respectivamente
	// e PL2 e SL2 são o código do país da seleção 2 e gols da seleção 2, respectivamente
	
	// A seleção 1 (a que aparece primeiro no placar) deve ser a que ganhou o jogo
	// Em caso de empate, a primeira a ser exibida deve ser a que possuir o menor código
	// do país correspondente, em ordem lexicográfica
	public String getPlacarJogo(int i) {
	}
	
}
