
/**
 * Esta classe representa um gol
 *
 */
public class Gol {
	
	/**
	 * Seleção do jogador que fez o gol
	 */
	private Selecao selecao1;
	
	/**
	 * Outra seleção presente no jogo (não necessariamente a que 
	 * sofreu o gol, pois pode ser um gol contra)
	 */
	private Selecao selecao2;
	
	/**
	 * Indica se o gol foi contra ou não.
	 */
	private boolean contra;
	
	/**
	 * Jogador que fez o gol.
	 */
	private Jogador jogador;

	/**
	 * Contrutor do gol.
	 * @param selecao1 Seleção do jogador que fez o gol 
	 * @param selecao2 Outra seleção.
	 * @param contra True se foi contra, false caso contrário
	 * @param jogador Jogador que fez o gol
	 */
	public Gol(Selecao selecao1, Selecao selecao2, boolean contra, Jogador jogador) {
		this.selecao1 = selecao1;
		this.selecao2 = selecao2;
		this.contra = contra;
		this.jogador = jogador;
	}

	/**
	 * Obtem seleção do jogador que fez o gol
	 * @return A seleção
	 */
	public Selecao getSelecao1() {
		return selecao1;
	}
	
	/**
	 * Obtem outra presente no jogo
	 * @return A seleção
	 */
	public Selecao getSelecao2() {
		return selecao2;
	}
	
	/**
	 * Obtem um valor que indica se o gol foi contra
	 * @return True se gol foi contra e false caso foi a favor.
	 */
	public boolean contra() {
		return contra;
	}
	
	/**
	 * Retorna o jogador que fez o gol.
	 * @return O jogador que fez o gol
	 */
	public Jogador getJogador() {
		return jogador;
	}

}
