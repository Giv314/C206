public class Main {
    public static void main(String[] args) {

        // Composicao : A arma so existe se instanciar a nave.
        Nave n1 = new Nave("Foguete", true, 1000);
        n1.arma.tipo = "Fogo";
        n1.arma.poder = 1000;
        n1.mostraInfo();

        // Agregacao: A arma existe, independente de outra classe.
        Arma a1 = new Arma("Eletronica", 500);
        n1.adicionarArma(a1);
    }
}
