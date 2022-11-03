import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CriaJogo cj = new CriaJogo();
        boolean key = true;
        int op;
        Scanner sc = new Scanner(System.in);

        while (key) {
            System.out.println("Bem vindo! Digite:");
            System.out.println("1 para jogar.");
            System.out.println("2 para visualizar os registros.");
            System.out.println("3 para deletar um registro.");
            System.out.println("4 para sair.");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    jogar(cj);
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
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

    public static void jogar(CriaJogo cj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String pessoa = sc.nextLine();

        while (!cj.escolheSimbolo()) {
            cj.escolheSimbolo();
        }

        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.criaTabuleiro();
        int posEscolhida;

        while(!tabuleiro.percorreArray()) { // Verifica se o tabuleiro está totalmente preenchido
            // Vez do usuario
            posEscolhida = CriaJogo.p1.jogar();
            while (posEscolhida == -1 || !CriaJogo.p1.verificaPosicao(tabuleiro, posEscolhida)) { // Verifica se a posição é válida
                posEscolhida = CriaJogo.p1.jogar();
            }
            tabuleiro.colocarSimbolo(posEscolhida, 1, cj.op);
            tabuleiro.mostraTabuleiro();

            // Vez do computador
            posEscolhida = CriaJogo.computador.jogar();
            while(!CriaJogo.computador.verificaPosicao(tabuleiro, posEscolhida) && !tabuleiro.percorreArray()) {
                posEscolhida = CriaJogo.computador.jogar();
            }
            tabuleiro.colocarSimbolo(posEscolhida, 2, cj.op2);
            tabuleiro.mostraTabuleiro();
        }
        String ganhador = tabuleiro.checar(pessoa);
        System.out.println("Ganhador: " + ganhador);
        System.out.println();
    }
}
