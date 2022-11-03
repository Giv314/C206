public class Sith extends Personagem implements Forca{
    // Atributos
    private boolean darth;
    private Sabre sabre;

    public Sith(String nome, int poder, boolean darth, Sabre sabre) {
        super(nome, poder);
        this.darth = darth;
        this.sabre = sabre;
    }

    // Implementações
    @Override
    public void travarBatalha() {
        System.out.println(this.getNome() + " travou uma batalha contra um jedi");
        aumentarPoder(getPoder() + 1);
    }

    // Método especifico
    public void corromperJedi(){
        if(darth && getPoder() > 60){
            System.out.println(this.getNome() + " levou um jedi para o lado negro da força");
        }else{
            System.out.println(this.getNome() + " ainda não consegue corromper jedis");
        }
    }

    @Override
    public void usarForca() {
        System.out.println(this.getNome() + " usou o lado negro da força");
        aumentarPoder(getPoder() + 3);
    }

    @Override
    public void trocarSabre(String cor) {
        sabre.setCor(cor);
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Cor do sabre: " + sabre.getCor());
        System.out.println("--------------------------------");
    }
}
