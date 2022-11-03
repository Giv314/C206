public class Droid extends Personagem{
    // Atributos
    private boolean hostil;

    public Droid(String nome, int poder, boolean hostil) {
        super(nome, poder);
        this.hostil = hostil;
    }

    // Metodos
    public void hackearSistema(){
        System.out.println(this.getNome() + " hackeou o sistema da nave");
    }
    //Implementações
    @Override
    public void travarBatalha() {
        if(hostil){
            System.out.println(this.getNome() + " travou uma batalha contra um jedi");
            aumentarPoder(getPoder() + 1);
        }else{
            System.out.println(this.getNome() + " travou uma batalha contra um sith");
            aumentarPoder(getPoder() + 1);
        }
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("--------------------------------");
    }
}
