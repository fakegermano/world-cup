/**
 * Esta classe representa um participante do tipo jogador
 */
public abstract class Jogador extends Participante {

    private int numero;

    /**
     * Construtor que inicializa variaveis internas.
     *
     * @param nome
     * @param numero
     */
    public Jogador(String nome, int numero) {
        super(nome);
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    @Override
    public int compareTo(Participante o) {
        if (o instanceof Tecnico) {
            return 1;
        } else {
            if (((Jogador) o).getNumero() < this.getNumero()) {
                return 1;
            } else if (this.getNumero() < ((Jogador) o).getNumero()){
                return -1;
            } else {
                return 0;
            }
        }
    }
}
