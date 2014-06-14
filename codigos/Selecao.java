import java.util.List;

/**
 * Esta classe representa uma seleção na copa.
 * Uma seleção é composta de um time de jogadores, junto ao seu técnico
 * (um jogador ou técnico é denominado "participante" aqui). A seleção também
 * possui um país, que é a nação que ela representa.
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
     *
     * @param pais          País da seleção
     * @param participantes Lista de participantes
     */
    public Selecao(Pais pais, List<Participante> participantes) {
        this.participantes = participantes;
        this.pais = pais;
    }

    /**
     * Procupa pelo jogador com o numero dado
     *
     * @param numeroJogador
     * @return
     */
    public Jogador getJogador(int numeroJogador) {
        for (Participante p : this.getParticipantes()) {
            if (p instanceof Jogador) {
                if (((Jogador) p).getNumero() == numeroJogador) {
                    return (Jogador) p;
                }
            }
        }
        return null;
    }

    /**
     * Retorna a lista de participantes desta seleção.
     *
     * @return Lista de participantes.
     */
    public List<Participante> getParticipantes() {
        return participantes;
    }

    public Pais getPais() {
        return pais;
    }

}
