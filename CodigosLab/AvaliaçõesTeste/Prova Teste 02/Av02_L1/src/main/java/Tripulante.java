public class Tripulante extends Astronauta implements Missao{
    private int qtdMissoes = 5;
    @Override
    public void fazerMissao() {
        System.out.println(this.getNome() + " fez uma missao");
        qtdMissoes--;
    }

    @Override
    public void verCameras() {
        super.verCameras();
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Quantidade de missões: " + qtdMissoes);
        System.out.println("------------------------------------");
    }

    @Override
    public void reportar() {
        System.out.println(this.getNome() + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(this.getNome() + " fez um reparo");
    }
}
