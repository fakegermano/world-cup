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

	// TODO Implementar:
	// * public CopaException (Tipo tipo, String mensagem) - construtor que recebe o tipo da exceção e sua mensagem
	// * public Tipo getTipo() - retornar o tipo da exceção
	// * atributos internos necessários
}
