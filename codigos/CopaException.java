/**
 * Esta classe representa uma exceção que pode ser disparada pelo
 * programa.
 */
public class CopaException extends Exception {

    /**
     * serialVersionUID padrão
     */
    private static final long serialVersionUID = 1L;

    /**
     * Enumeração interna que representa o tipo da exceção
     */
    public enum Tipo {
        SELECOES_GOL_NAO_PRESENTES_GRUPO,
        NENHUM_JOGO_COM_SELECOES_GOL,
        ARQUIVO_SELECAO_NAO_EXISTE,
        JOGO_COM_SELECAO_INVALIDA;
    }

    private Tipo tipo;

    public CopaException(Tipo tipo, String mensagem) {
        super(mensagem);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return this.tipo;
    }
}
