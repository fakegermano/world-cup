import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String comando;

        HashMap<String, Selecao> selecoes = new HashMap<String, Selecao>();
        HashMap<String, Grupo> grupos = new HashMap<String, Grupo>();

        do {
            comando = entrada.next();

            if (comando.equals("lerSelecoes")) {
                int numeroSelecoes = entrada.nextInt();
                entrada.nextLine();

                for (int i = 0; i < numeroSelecoes; i++) {
                    String arquivo = entrada.nextLine();
                    try {
                        Selecao selecao = LeitorSelecoes.lerSelecao(arquivo);
                        selecoes.put(selecao.getPais().getCodigo(), selecao);
                    } catch (CopaException e) {
                        if (e.getTipo() != CopaException.Tipo.ARQUIVO_SELECAO_NAO_EXISTE)
                            System.out.println("Erro desconhecido");
                        else
                            System.out.println(e.getMessage());
                    }
                }
            } else if (comando.equals("criarGrupo")) {
                String nomeGrupo = entrada.next();
                String selecao1 = entrada.next();
                String selecao2 = entrada.next();
                String selecao3 = entrada.next();
                String selecao4 = entrada.next();
                Grupo grupo = new Grupo(nomeGrupo);
                grupos.put(nomeGrupo, grupo);
                grupo.adicionaSelecao(selecoes.get(selecao1));
                grupo.adicionaSelecao(selecoes.get(selecao2));
                grupo.adicionaSelecao(selecoes.get(selecao3));
                grupo.adicionaSelecao(selecoes.get(selecao4));
            } else if (comando.equals("adicionaGol")) {
                String codigoGrupo = entrada.next();
                String selecao1 = entrada.next();
                String selecao2 = entrada.next();
                boolean contra = entrada.next().equals("contra");
                int numeroJogador = entrada.nextInt();

                Grupo grupo = grupos.get(codigoGrupo);
                Jogador jogador = selecoes.get(selecao1).getJogador(numeroJogador);


                try {
                    grupo.adicionaGol(new Gol(selecoes.get(selecao1), selecoes.get(selecao2), contra, jogador));
                } catch (CopaException e) {
                    if (e.getTipo() != CopaException.Tipo.NENHUM_JOGO_COM_SELECOES_GOL)
                        System.out.println(e.getMessage());
                    else if (e.getTipo() != CopaException.Tipo.SELECOES_GOL_NAO_PRESENTES_GRUPO)
                        System.out.println(e.getMessage());
                    else
                        System.out.println("Erro desconhecido");
                }
            } else if (comando.equals("imprimePlacaresGrupo")) {
                String codigoGrupo = entrada.next();
                Grupo grupo = grupos.get(codigoGrupo);

                System.out.println("Grupo " + codigoGrupo);
                for (int i = 0; i < grupo.getNumeroJogos(); i++) {
                    System.out.println(grupo.getPlacarJogo(i));
                }
                System.out.println();
            } else if (comando.equals("imprimirSelecao")) {
                String codigoSelecao = entrada.next();
                Selecao selecao = selecoes.get(codigoSelecao);
                List<Participante> participantes = selecao.getParticipantes();
                Pais pais = selecao.getPais();

                System.out.print("Selecao " + pais.getCodigo() + " ");
                if (pais.africano()) System.out.println("(Africa)");
                if (pais.americano()) System.out.println("(America)");
                if (pais.asiatico()) System.out.println("(Asia)");
                if (pais.europeu()) System.out.println("(Europa)");
                if (pais.oceanico()) System.out.println("(Oceania)");

                for (Participante p : participantes)
                    System.out.println(p);
            } else if (comando.equals("imprimirSelecaoOrdenada")) {
                String codigoSelecao = entrada.next();
                Selecao selecao = selecoes.get(codigoSelecao);
                List<Participante> participantes = selecao.getParticipantes();
                Pais pais = selecao.getPais();

                System.out.print("Selecao " + pais.getCodigo() + " ");
                if (pais.africano()) System.out.println("(Africa)");
                if (pais.americano()) System.out.println("(America)");
                if (pais.asiatico()) System.out.println("(Asia)");
                if (pais.europeu()) System.out.println("(Europa)");
                if (pais.oceanico()) System.out.println("(Oceania)");

                ArrayList<Participante> ordenados = new ArrayList<Participante>(participantes);
                Collections.sort(ordenados);

                for (Participante p : ordenados)
                    System.out.println(p);
            } else if (comando.equals("listarGrupo")) {
                String codigoGrupo = entrada.next();
                Grupo grupo = grupos.get(codigoGrupo);


                System.out.print(grupo.getNome());
                for (Selecao selecao : grupo.getSelecoes()) {
                    System.out.print(" " + selecao.getPais().getCodigo());
                }
                System.out.println();
            } else if (comando.equals("adicionaJogo")) {
                String codigoGrupo = entrada.next();
                Grupo grupo = grupos.get(codigoGrupo);
                String codigoSelecao1 = entrada.next();
                String codigoSelecao2 = entrada.next();
                Selecao selecao1 = selecoes.get(codigoSelecao1);
                Selecao selecao2 = selecoes.get(codigoSelecao2);


                try {
                    grupo.adicionaJogo(new Jogo(selecao1, selecao2));
                } catch (CopaException e) {
                    if (e.getTipo() == CopaException.Tipo.JOGO_COM_SELECAO_INVALIDA)
                        System.out.println(e.getMessage());
                    else
                        System.out.println("Erro desconhecido");
                }
            }

        } while (!comando.equals("sair"));
    }

}
