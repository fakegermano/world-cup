
/**
 * Esta classe representa um participante de uma seleção.
 */
public abstract class Participante implements Comparable<Participante> {

    /**
     * Nome do participante
     */
    private String nome;

    /**
     * Construtor de participante
     *
     * @param nome Nome do participante
     */
    public Participante(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém nome do participante
     *
     * @return Nome do participante.
     */
    public String getNome() {
        return nome;
    }

}
