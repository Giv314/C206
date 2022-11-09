import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variaveis auxiliares para o menu
        boolean key = false;
        int op;
        Scanner sc = new Scanner(System.in);

        // Variaveis auxiliares para armazenar infos digitadas pelo usuário
        String nomeAux;
        int velocidadeAux;
        String chassiAux;
        // Criando um arraylist que pegará as infos do arquivo
        ArrayList<Carrinho> carrinhoLista;
        // Criando arquivo
        Arquivo a = new Arquivo("CarrinhosInfo");

        // Criando menu
        while(!key) {
            System.out.println("Bem vindo ao menu! Escolha:");
            System.out.println("1 - Salvar informações do carrinho em um arquivo txt");
            System.out.println("2 - Mostrar as informações dos carrinhos salvos no arquivo;");
            System.out.println("3 - Ordenar os carrinhos em ordem crescente de velocidade");
            System.out.println("4 - Ordenar os carrinhos em ordem descrescente de velocidade");
            System.out.println("Qualquer outro digito para sair.");
            try {
                op = sc.nextInt();
                switch (op){
                    case 1:
                        System.out.println("Nome do jogador:");
                        sc.nextLine();
                        nomeAux = sc.nextLine();
                        System.out.println("Velocidade do carrinho:");
                        velocidadeAux = sc.nextInt();
                        if(velocidadeAux < 0){
                            throw new InfoInvalidaException("Velocidade menor que zero!");
                        }
                        System.out.println("Chassi:");
                        sc.nextLine();
                        chassiAux = sc.nextLine();
                        if(chassiAux.equals("Breakout") || chassiAux.equals("Merc") || chassiAux.equals("Octane")){
                            // Criando um carrinho e escrevendo as infos dele no arquivo
                            Carrinho carrinho1 = new Carrinho();
                            carrinho1.setNomeJogador(nomeAux);
                            carrinho1.setChassi(chassiAux);
                            carrinho1.setVelocidade(velocidadeAux);
                            a.escrever(carrinho1);
                        }else{
                            throw new InfoInvalidaException("Chassi com informação inválida!");
                        }
                        break;
                    case 2:
                        carrinhoLista = a.ler();
                        for (Carrinho c : carrinhoLista) {
                            c.mostraInfo();
                        }
                        break;
                    case 3:
                        carrinhoLista = a.ler();
                        Collections.sort(carrinhoLista);
                        for (Carrinho c : carrinhoLista) {
                            c.mostraInfo();
                        }
                        break;
                    case 4:
                        carrinhoLista = a.ler();
                        Collections.sort(carrinhoLista);
                        Collections.reverse(carrinhoLista);
                        for (Carrinho c : carrinhoLista) {
                            c.mostraInfo();
                        }
                        break;
                    default:
                        System.out.println("Você saiu do programa");
                        key = true;
                }
            }catch (Exception e){
                System.out.println("Algo deu errado! Tente novamente");
                System.out.println("Exceção: " + e);
                key = true;
            }
        }
    }
}
