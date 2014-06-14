
/**
 * Classe que representa um participante do tipo técnico
 */
public class Tecnico extends Participante {

    /**
     * @param nome
     */
    public Tecnico(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "TEC:" + getNome();
    }

    @Override
    public int compareTo(Participante o) {
        if (o instanceof Jogador) {
            return -1;
        } else {
            return 0;
        }
    }
}
