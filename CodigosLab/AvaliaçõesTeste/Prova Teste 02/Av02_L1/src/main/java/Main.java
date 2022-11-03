public class Main {
    public static void main(String[] args) {
        Astronauta[] astronautas = new Astronauta[15];
        astronautas[0] = new Impostor();
        astronautas[1] = new Impostor();
        astronautas[2] = new Tripulante();
        astronautas[3] = new Tripulante();

        // Preenchendo dados

        astronautas[0].setNome("Joao");
        astronautas[0].setCor("Amarelo");
        astronautas[0].pet.setNome("Cachorro");
        astronautas[0].skin.setTipo("Metal");

        astronautas[1].setNome("Gustavo");
        astronautas[1].setCor("Verde");

        astronautas[2].setNome("Pedro");
        astronautas[2].setCor("Roxo");
        astronautas[2].pet.setNome("Gato");
        astronautas[2].skin.setTipo("Plástico");

        astronautas[3].setNome("Samuel");
        astronautas[3].setCor("Amarelo");

        for (int i = 0; i < astronautas.length; i++) {
            if (astronautas[i] instanceof Impostor) {
                Impostor i1 = (Impostor) astronautas[i];
                System.out.println("Tipo: Impostor");
                i1.usarVentoinha();
                i1.trancarPortas("Sala");
                i1.fazerMissao();
                i1.sabotarLuz();
                i1.sabotarOxigenio();
                i1.sabotarReator();
                i1.sabotarComunicacao();
                i1.executar();
                i1.reportar();
                i1.reparar();
                i1.verCameras();
                i1.mostraInfo();
            } else {
                if (astronautas[i] instanceof Tripulante) {
                    System.out.println("Tipo: Tripulante");
                    Tripulante t1 = (Tripulante) astronautas[i];
                    t1.fazerMissao();
                    t1.reportar();
                    t1.reparar();
                    t1.verCameras();
                    t1.mostraInfo();
                }
            }
        }
        System.out.println("Quantidade total de astronautas: " + Astronauta.cont);
    }
}
