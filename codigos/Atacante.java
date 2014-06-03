
/**
 * Esta classe representa um jogador do tipo atacante.
 */
public class Atacante extends Jogador {

	/**
	 * Construtor padrão.
	 * @param nome Nome do jogador
	 * @param numero Número do jogador 
	 */
	public Atacante(String nome, int numero) {
		super(nome, numero);
	}

	@Override
	public String toString() {
		return getNumero() + ":ATA:" + getNome();
	}
}
