import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Separando espaco de memoria para referencias

        Biblioteca b1 = new Biblioteca();

        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Menu de infos:");
            System.out.println("Digite 1 para adicionar livro");
            System.out.println("Digite 2 para mostrar infos da biblioteca e dos livros");
            System.out.println("Digite 3 para alugar livro");
            System.out.println("Digite 4 para sair do menu");

            int op = input.nextInt();
            switch (op){
                case 1:
                    Livro l3;
                    System.out.println("Entre com o nome do livro: ");
                    input.nextLine();
                    String nomeLivro = input.nextLine();
                    System.out.println("Entre com a quantidade de paginas: ");
                    int qtd = input.nextInt();
                    l3 = new Livro(nomeLivro, qtd);
                    b1.adicionarLivro(l3);
                    break;
                case 2:
                    b1.mostraInfo();
                    break;
                case 3:
                    System.out.println("Nome do livro a ser alugado: ");
                    input.nextLine(); // Fazer isso sempre antes de entrar com string
                    nomeLivro = input.nextLine();
                    if(b1.alugarLivro(nomeLivro)){
                        System.out.println("O livro " + nomeLivro + " foi alugado");
                    }
                    else{
                        System.out.println("O livro nao foi alugado!");
                    }
                    break;
                case 4:
                    flag = false;
                    System.out.println("Voce saiu do menu");
                    break;
                default:
                    System.out.println("Numero invalido");

            }
        }
    }
}
