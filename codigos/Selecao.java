import java.util.List;

/**
 * Esta classe representa uma seleção na copa. 
 * Uma seleção é composta de um time de jogadores, junto ao seu técnico
 * (um jogador ou técnico é denominado "participante" aqui). A seleção também
 * possui um país, que é a nação que ela representa.
 *
 */
public class Selecao {

	/**
	 * Participantes do time
	 */
	private List<Participante> participantes;
	
	/**
	 * País do time
	 */
	private Pais pais;

	/**
	 * Contrutor de seleção.
	 * @param pais País da seleção
	 * @param participantes Lista de participantes
	 */
	public Selecao(Pais pais, List<Participante> participantes) {
		this.participantes = participantes;
		this.pais = pais;
	}

	// TODO Obter jogador pelo seu número. Retorne null caso o jogador com o número dado não exista.
	public Jogador getJogador(int numeroJogador) {
	}
	
	/**
	 * Retorna a lista de participantes desta seleção.
	 * @return Lista de participantes.
	 */
	public List<Participante> getParticipantes() {
		return participantes;
	}
	
	public Pais getPais(){
		return pais;
	}
	
}
