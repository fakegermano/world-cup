import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe usada para fazer a leitura das seleções de arquivos texto
 */
public class LeitorSelecoes {
    private String arquivo;
    private Scanner fonteDados;

    public LeitorSelecoes(String arquivo) {
        this.arquivo = arquivo;
    }

    public void abreArquivo() throws CopaException {
        try {
            File arq = new File(arquivo);
            if (!arq.isFile()) {
                throw new FileNotFoundException();
            }
            this.fonteDados = new Scanner(arq);
        } catch (FileNotFoundException e) {
            throw new CopaException(CopaException.Tipo.ARQUIVO_SELECAO_NAO_EXISTE, "Arquivo de selecao " + arquivo + " nao existe");
        }

    }

    public void fechaArquivo() {
        this.fonteDados.close();
    }

    public static Selecao lerSelecao(String arquivo) throws CopaException {
        ArrayList<Participante> participantes = new ArrayList<Participante>();
        LeitorSelecoes leitor = new LeitorSelecoes(arquivo);
        leitor.abreArquivo();
        String codigo = leitor.fonteDados.nextLine();
        while (leitor.fonteDados.hasNextLine()) {
            String linha = leitor.fonteDados.nextLine();
            String vetor[] = linha.split(";");
            if (vetor[0].equals("Tecnico")) {
                participantes.add(new Tecnico(vetor[1]));
            } else if (vetor[0].equals("Goleiro")) {
                participantes.add(new Goleiro(vetor[1], Integer.parseInt(vetor[2])));
            } else if (vetor[0].equals("Defensor")) {
                participantes.add(new Defensor(vetor[1], Integer.parseInt(vetor[2])));
            } else if (vetor[0].equals("Meia")) {
                participantes.add(new Meia(vetor[1], Integer.parseInt(vetor[2])));
            } else if (vetor[0].equals("Atacante")) {
                participantes.add(new Atacante(vetor[1], Integer.parseInt(vetor[2])));
            }
        }
        return new Selecao(Pais.getByCodigo(codigo), participantes);


    }

}
