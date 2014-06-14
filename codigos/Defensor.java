
/**
 * Esta classe representa um jogador do tipo defensor.
 */
public class Defensor extends Jogador {

    /**
     * Construtor padrão.
     *
     * @param nome   Nome do jogador
     * @param numero Número do jogador
     */
    public Defensor(String nome, int numero) {
        super(nome, numero);
    }

    @Override
    public String toString() {
        return getNumero() + ":DEF:" + getNome();
    }
}
