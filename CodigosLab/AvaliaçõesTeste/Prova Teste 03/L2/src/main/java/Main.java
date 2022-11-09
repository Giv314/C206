import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variaveis auxiliares para criar um livro
        String nomeAux;
        String autorAux;
        String editoraAux;
        int nPagAux;
        // Criando o arquivo
        Arquivo arquivo = new Arquivo("Livros");
        ArrayList<Livro> livros;
        // Criando scanner e controle do menu
        Scanner sc = new Scanner(System.in);
        boolean key = false;
        int opcao;
        // Criando Menu
        while(!key) {
            System.out.println("Bem vindo ao menu! Escolha:");
            System.out.println("1 - Salvar informações de um livro no arquivo txt");
            System.out.println("2 - Mostrar informações dos livros salvos no arquivo txt");
            System.out.println("3 - Ordenar os livros em ordem crescente de páginas");
            System.out.println("4 - Ordenar os livros em ordem decrescente de páginas");
            System.out.println("Qualquer digito para sair");
            try {
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        try {
                            System.out.println("Nome do livro: ");
                            nomeAux = sc.nextLine();
                            System.out.println("Autor: ");
                            autorAux = sc.nextLine();
                            System.out.println("Editora: ");
                            editoraAux = sc.nextLine();
                            if (editoraAux.equals("Leya") || editoraAux.equals("Arqueiro") || editoraAux.equals("Rocco")) {
                                System.out.println("Numero de paginas: ");
                                nPagAux = sc.nextInt();
                                Livro livro1 = new Livro(nomeAux, autorAux, editoraAux, nPagAux);
                                arquivo.escrever(livro1);
                            } else {
                                throw new InfoInvalidaException("Informação invalida");
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        break;
                    case 2:
                        livros = arquivo.ler();
                        for (Livro livro : livros) {
                            livro.mostraInfo();
                        }
                        break;
                    case 3:
                        livros = arquivo.ler();
                        Collections.sort(livros);
                        for (Livro livro : livros) {
                            livro.mostraInfo();
                        }
                        break;
                    case 4:
                        livros = arquivo.ler();
                        Collections.reverse(livros);
                        for (Livro livro : livros) {
                            livro.mostraInfo();
                        }
                        break;
                    default:
                        key = true;
                }
            }catch (Exception e){
                key = true;
            }
        }
        System.out.println("Programa finalizado!");
    }
}
