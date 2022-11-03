public class Impostor extends Astronauta implements Missao, Sabotar, Executar{
    // Atributos
    private int qtdMortes;
    // Metodos
    public void usarVentoinha(){
        System.out.println("O impostor se escondeu na ventilação");
    }

    public void trancarPortas(String local){
        System.out.println("O impostor trancou as portas do(a) " + local);
    }

    // Implementacoes e overrides


    @Override
    public void verCameras() {
        super.verCameras();
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Quantidade de mortes: " + qtdMortes);
        System.out.println("---------------------");
    }

    @Override
    public void fazerMissao() {
        System.out.println(this.getNome() + " fez uma tarefa falsa");
    }

    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou oxigenio");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator");
    }

    @Override
    public void sabotarComunicacao() {
        System.out.println("O impostor sabotou a comunicação");
    }

    @Override
    public void executar() {
        System.out.println(this.getNome() + " matou um tripulante");
        qtdMortes++;
    }

    @Override
    public void reportar() {
        System.out.println(this.getNome() + " fez um self report");
    }

    @Override
    public void reparar() {
        System.out.println(this.getNome() + " fingiu que fez um reparo");
    }
}
