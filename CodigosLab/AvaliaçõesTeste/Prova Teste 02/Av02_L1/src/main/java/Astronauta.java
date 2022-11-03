public abstract class Astronauta {
    // Atributos
    public static int cont;
    private String cor;
    private String nome;
    public Skin skin = new Skin();
    public Pet pet = new Pet();

    // Metodos
    public void mostraInfo(){
        System.out.println("Infos: ");
        System.out.println("Cor: " + this.cor);
        System.out.println("Nome: " + this.nome);

        if(skin.getTipo() != null){
            System.out.println("Tipo da skin: " + skin.getTipo());
        }else{
            System.out.println("Esse astronauta não possui skin");
        }

        if(pet.getNome() != null){
            System.out.println("Nome do pet: " + this.pet.getNome());
        }else{
            System.out.println("Esse astronauta não possui pet");
        }

        cont++;
    }
    public void verCameras(){
        System.out.println(this.nome + " olhou as cameras");
    }

    public abstract void reportar();
    public abstract void reparar();

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
