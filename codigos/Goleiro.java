
/**
 * Esta classe representa um jogador do tipo goleiro.
 */
public class Goleiro extends Jogador {

    /**
     * Construtor padrão.
     *
     * @param nome   Nome do jogador
     * @param numero Número do jogador
     */
    public Goleiro(String nome, int numero) {
        super(nome, numero);
    }

    @Override
    public String toString() {
        return getNumero() + ":GOL:" + getNome();
    }
}
