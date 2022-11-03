public class Nave {
    public String nome;
    public boolean velocidadeLuz;
    public int velocidade;
    Arma arma;

    public Nave(String nome, boolean velocidadeLuz, int velocidade) {
        this.nome = nome;
        this.velocidadeLuz = velocidadeLuz;
        this.velocidade = velocidade;
        this.arma = new Arma(); // Composicao
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Velocidade da luz: " + ((this.velocidadeLuz)?"Sim" : "Nao"));
        System.out.println("Tipo da arma: " + this.arma.tipo);
        System.out.println("Poder da arma: " + this.arma.poder);
    }

    void adicionarArma(Arma arma){
        this.arma = arma;
    }
}
