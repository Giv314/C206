public class Nave {
    private String nome;
    public Personagem[] personagens = new Personagem[3];
    private boolean velocidadeLuz;

    public Nave(String nome, boolean velocidadeLuz) {
        this.nome = nome;
        this.velocidadeLuz = velocidadeLuz;
    }

    public void mostraInfo(){
        System.out.println("Infos da nave:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade da luz: " + this.velocidadeLuz);
        System.out.println("------------------------------------------");
        System.out.println("Infos dos personagens:");
        for (int i = 0; i < personagens.length; i++) {
            personagens[i].mostraInfo();
        }
    }

}
