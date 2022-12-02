import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CriaJogo cj = new CriaJogo();
        Arquivo arq = new Arquivo("Partidas.txt");
        boolean key = true;
        int op;
        Scanner sc = new Scanner(System.in);

        while (key) {
            System.out.println("Bem vindo! Digite:");
            System.out.println("1 - Jogar.");
            System.out.println("2 - Visualizar os registros dos ganhadores.");
            System.out.println("3 - Apagar os registros.");
            System.out.println("4 - Sair.");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    jogar(cj, arq);
                    break;
                case 2:
                    ArrayList<Pessoa> pessoasInfo = arq.ler();
                    for (int i = 0; i < pessoasInfo.size(); i++) {
                        pessoasInfo.get(i).mostraInfo();
                    }
                    break;
                case 3:
                    arq.deletar("Partidas.txt");
                    break;
                case 4:
                    System.out.println("Você saiu do jogo!");
                    key = false;
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
}

    public static void jogar(CriaJogo cj, Arquivo arq) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        cj.p1 = new Pessoa();
        cj.p1.nome = sc.nextLine();
        System.out.println("Digite o nome do seu oponente:");
        cj.p2 = new Pessoa();
        cj.p2.nome = sc.nextLine();

        while (!cj.escolheSimbolo(cj.p1.nome)) {
            cj.escolheSimbolo(cj.p1.nome);
        }

        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.criaTabuleiro();
        int posEscolhida;

        while(true) { // Verifica se o tabuleiro está totalmente preenchido ou se o jogo acabou
            // Vez do jogador 1
            posEscolhida = cj.p1.jogar();
                while (posEscolhida == -1 || !cj.p1.verificaPosicao(tabuleiro, posEscolhida)) { // Verifica se a posição é válida
                    posEscolhida = cj.p1.jogar();
                }
                tabuleiro.colocarSimbolo(posEscolhida, 1, cj.p1.simbolo);
                tabuleiro.mostraTabuleiro();
                if(!tabuleiro.checar(cj.p1.nome, cj.p2.nome).equals("Continuar")){
                    String ganhador = tabuleiro.checar(cj.p1.nome, cj.p2.nome);
                    finalizarJogo(ganhador, arq);
                    break;
            }
                // Vez do jogador 2
                posEscolhida = cj.p2.jogar();
                while (!cj.p2.verificaPosicao(tabuleiro, posEscolhida) && !tabuleiro.percorreArray()) {
                    posEscolhida = cj.p2.jogar();
                }
                tabuleiro.colocarSimbolo(posEscolhida, 2, cj.p2.simbolo);
                tabuleiro.mostraTabuleiro();
            if(!tabuleiro.checar(cj.p1.nome, cj.p2.nome).equals("Continuar")){
                String ganhador = tabuleiro.checar(cj.p1.nome, cj.p2.nome);
                finalizarJogo(ganhador, arq);
                break;
        }
        }
    }

    public static void finalizarJogo(String ganhador, Arquivo arq){
        System.out.println("Jogo finalizado.");
        System.out.println("Ganhador: " + ganhador);
        arq.escrever(ganhador);
        System.out.println();
    }
}
