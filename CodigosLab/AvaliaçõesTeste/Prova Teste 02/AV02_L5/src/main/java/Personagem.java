public abstract class Personagem {
    public static int cont;
    private String nome;
    private int id;
    private int poder;


    public Personagem(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
    }
    public void mostraInfo(){
        id = cont;
        System.out.println("Nome: " + this.nome);
        System.out.println("id: " + this.id);
        System.out.println("poder: " + this.poder);
        cont++;
    }
    public abstract void travarBatalha();

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public void aumentarPoder(int poderNovo){
        this.poder = poderNovo;
    }
}
