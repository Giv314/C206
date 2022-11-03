import java.util.Scanner;

public class Pessoa extends Jogador{
    public int jogada;
    public Pessoa(String simbolo) {
        super(simbolo);
    }

    @Override
    public int jogar() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Sua vez! Entre com um valor de 0-8:");
            jogada = sc.nextInt();
            if (jogada > 8 || jogada < 0) {
                throw new JogoException("Posicao Invalida!");
            }else{
                return jogada;
            }
        } catch (Exception p) {
            return -1;
        }
    }

    @Override
    public boolean verificaPosicao(Tabuleiro t, int pos) {
        return super.verificaPosicao(t, pos);
    }
}
