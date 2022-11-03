public class Jedi extends Personagem implements Treinamento, Forca{
    // Atributos
    private boolean mestre;
    private Sabre sabre;
    // Construtor
    public Jedi(String nome, int poder, boolean mestre, Sabre sabre) {
        super(nome, poder);
        this.mestre = mestre;
        this.sabre = sabre;
    }

    // Implementações
    @Override
    public void travarBatalha() {
        System.out.println(this.getNome() + " travou uma batalha contra um sith");
        aumentarPoder(getPoder() + 1);
    }

    @Override
    public void usarForca() {
        System.out.println(this.getNome() + " usou a força para o bem");
        aumentarPoder(getPoder() + 5);
    }

    @Override
    public void trocarSabre(String cor) {
        sabre.setCor(cor);
    }

    @Override
    public void treinarPadawan() {
        if(mestre || getPoder() > 70){
            System.out.println(getNome() + " treinou um padawan");
        }else{
            System.out.println(this.getNome() + " ainda não consegue treinar padawans");
        }
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Cor do sabre: " + sabre.getCor());
        System.out.println("--------------------------------");
    }
}
