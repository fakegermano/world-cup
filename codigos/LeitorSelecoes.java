/**
 * Classe usada para fazer a leitura das seleções de arquivos texto
 */
public class LeitorSelecoes {

	/*
	 * TODO este método é mandatório e você pode incluir outros se achar que deve.
	 * Deve ser feita a leitura de um arquivo texto e retornada um objeto do tipo
	 * Selecao com a seleção representada no arquivo. Lembre-se de fechar o arquivo ao final da leitura.
	 * Caso o arquivo não exista, dispare uma exceção da classe CopaException, com 
	 * o tipo ARQUIVO_SELECAO_NAO_EXISTE e mensagem "Arquivo de selecao ARQUIVO nao existe",
	 * onde ARQUIVO é o nome do arquivo.
	 * 
	 * O formato do arquivo é o seguinte:
	 * - Na primeira linha, há o código do país da seleção, o mesmo usado na enumeração Pais.
	 * - Cada uma das linhas seguintes possui a descrição de um participante. Sendo NOME o nome do
	 * participante, NUMERO o número do jogador e TIPO o tipo do jogador, as linhas tem o seguinte formato
	 * (sempre sem as aspas):
	 * 1) Se o participante for um técnico: "Tecnico;NOME"
	 * 2) Se o participante for um jogador goleiro: "Goleiro;NOME;NUMERO"
	 * 3) Se o participante for um jogador defensor: "Defensor;NOME;NUMERO"
	 * 4) Se o participante for um jogador meia: "Meia;NOME;NUMERO"
	 * 5) Se o participante for um jogador atacante: "Atacante;NOME;NUMERO"
	 */
	public static Selecao lerSelecao(String arquivo) throws CopaException {
	}

}
