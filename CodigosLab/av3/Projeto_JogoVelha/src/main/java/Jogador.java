
public class Jogador {
    protected String simbolo;

    public Jogador() {

    }

    public int jogar(){
        return -1;
    }

    public boolean verificaPosicao(Tabuleiro t, int pos) {
        try {
            if (!t.simbolos.get(pos).equals(" ")) {
                throw new JogoException("Posição já preenchida!");
            }
            return true;
        }catch (JogoException j){
            return false;
        }
    }
}
