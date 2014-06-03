import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa um jogo
 * @author rodrigo
 *
 */
public class Jogo {
	
	/**
	 * Primeira seleção do jogo 
	 */
	private Selecao selecao1;
	
	/**
	 * Segunda seleção do jogo 
	 */
	private Selecao selecao2;
	
	/**
	 * Gols do jogo 
	 */
	private ArrayList<Gol> gols;

	/**
	 * Construtor do Jogo
	 * @param selecao1 Primeira seleção do jogo
	 * @param selecao2 Segunda seleção do jogo
	 */
	public Jogo (Selecao selecao1, Selecao selecao2) {
		this.selecao1 = selecao1;
		this.selecao2 = selecao2;
		gols = new ArrayList<Gol>();
	}

	/**
	 * Retorna a primeira seleção do jogo 
	 * @return A primeira seleção do jogo
	 */
	public Selecao getSelecao1() {
		return selecao1;
	}
	
	/**
	 * Retorna a segunda seleção do jogo 
	 * @return A segunda seleção do jogo
	 */
	public Selecao getSelecao2() {
		return selecao2;
	}

	/**
	 * Adiciona um gol neste jogo
	 * @param gol Gol a ser adicionado
	 */
	public void adicionaGol(Gol gol) {
		gols.add(gol);
	}
	
	/**
	 * Retorna lista de gols neste jogo
	 * @return
	 */
	public List<Gol> getGols() {
		return gols;
	}
	
}
