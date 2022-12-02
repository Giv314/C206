import java.util.Scanner;

public class Pessoa extends Jogador{
    public int jogada;
    public String nome;
    public String dataHoraAux;

    public Pessoa(){
        super();
    }

    @Override
    public int jogar() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Vez de " + nome + ". Entre com um valor de 0-8:");
            jogada = sc.nextInt();
            if (jogada > 8 || jogada < 0) {
                throw new JogoException("Posição Invalida!");
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

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Data e hora que ganhou: " + dataHoraAux);
    }
}
