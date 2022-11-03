import java.util.Random;

public class Computador extends Jogador{

    Random posC = new Random();
    public Computador(String simbolo) {
        super(simbolo);
    }

    @Override
    public int jogar() {
        System.out.println("É a vez do computador!");
        int posEscolhida =  posC.nextInt(9);
        return posEscolhida;
    }

    @Override
    public boolean verificaPosicao(Tabuleiro t, int pos) {
        return super.verificaPosicao(t, pos);
    }
}
