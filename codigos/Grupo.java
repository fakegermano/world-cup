import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe representa um grupo da primeira fase.
 */
public class Grupo {

    /**
     * Nome do grupo
     */
    private String nome;

    /**
     * Seleções neste grupo
     */
    private List<Selecao> selecoes;

    /**
     * Jogos neste grupo.
     */
    private List<Jogo> jogos;

    public Grupo(String nome) {
        this.nome = nome;
        this.selecoes = new ArrayList<Selecao>();
        this.jogos = new ArrayList<Jogo>();
    }

    public void adicionaSelecao(Selecao selecao) {
        this.getSelecoes().add(selecao);
    }

    public String getNome() {
        return this.nome;
    }

    public List<Selecao> getSelecoes() {
        return this.selecoes;
    }

    public void adicionaJogo(Jogo jogo) throws CopaException {
        if (!this.getSelecoes().contains(jogo.getSelecao1()) || !this.getSelecoes().contains(jogo.getSelecao2())) {
            throw new CopaException(CopaException.Tipo.JOGO_COM_SELECAO_INVALIDA, "Selecao nao presente no grupo");
        } else {
            jogos.add(jogo);
        }
    }

    public void adicionaGol(Gol gol) throws CopaException {
        if (!this.getSelecoes().contains(gol.getSelecao1()) || !this.getSelecoes().contains(gol.getSelecao2())) {
            throw new CopaException(CopaException.Tipo.SELECOES_GOL_NAO_PRESENTES_GRUPO, "Uma das selecoes indicadas nao pertence a este grupo");
        } else {
            boolean found = false;
            for (Jogo j : this.jogos) {
                if ((j.getSelecao1().equals(gol.getSelecao1()) && j.getSelecao2().equals(gol.getSelecao2()))
                        ||(j.getSelecao1().equals(gol.getSelecao2()) && j.getSelecao2().equals(gol.getSelecao1()))) {
                    found = true;
                    j.adicionaGol(gol);
                }
            }
            if (!found) {
                throw new CopaException(CopaException.Tipo.NENHUM_JOGO_COM_SELECOES_GOL, "Nenhum jogo com as selecoes indicadas");
            }

        }
    }

    public int getNumeroJogos() {
        return this.jogos.size();
    }

    public String getPlacarJogo(int i) {
        Jogo atual = this.jogos.get(i);
        Selecao selecao1 = atual.getSelecao1();
        Selecao selecao2 = atual.getSelecao2();
        int golsSelecao1 = 0, golsSelecao2 = 0;
        for (Gol gol : atual.getGols()) {
            if (gol.contra() && gol.getSelecao2().equals(selecao1)) {
                golsSelecao1++;
            } else if (gol.contra() && gol.getSelecao2().equals(selecao2)) {
                golsSelecao2++;
            } else if (!gol.contra() && gol.getSelecao1().equals(selecao1)) {
                golsSelecao1++;
            } else if (!gol.contra() && gol.getSelecao1().equals(selecao2)) {
                golsSelecao2++;
            }
        }
        if (golsSelecao1 > golsSelecao2) {
            return (atual.getSelecao1().getPais().getCodigo() + " " + golsSelecao1 + " X " +
                    golsSelecao2 + " " + atual.getSelecao2().getPais().getCodigo());
        } else if (golsSelecao2 > golsSelecao1) {
            return (atual.getSelecao2().getPais().getCodigo() + " " + golsSelecao2 + " X " +
                    golsSelecao1 + " " + atual.getSelecao1().getPais().getCodigo());
        } else if (atual.getSelecao1().getPais().getCodigo().compareTo(atual.getSelecao2().getPais().getCodigo()) < 0) {
            return (atual.getSelecao1().getPais().getCodigo() + " " + golsSelecao1 + " X " +
                    golsSelecao2 + " " + atual.getSelecao2().getPais().getCodigo());
        } else {
            return (atual.getSelecao2().getPais().getCodigo() + " " + golsSelecao2 + " X " +
                    golsSelecao1 + " " + atual.getSelecao1().getPais().getCodigo());
        }

    }
}
