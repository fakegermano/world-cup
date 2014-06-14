
/**
 * Esta classe representa um jogador do tipo meia.
 */
public class Meia extends Jogador {

    /**
     * Construtor padrão.
     *
     * @param nome   Nome do jogador
     * @param numero Número do jogador
     */
    public Meia(String nome, int numero) {
        super(nome, numero);
    }

    @Override
    public String toString() {
        return getNumero() + ":MEI:" + getNome();
    }
}
