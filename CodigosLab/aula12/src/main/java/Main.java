public class Main {
    public static void main(String[] args) {
        // Queremos que o som ambiente toque ao mesmo tempo que ele mostre o mapa
        somAmbiente som = new somAmbiente();
        Mapa mapa = new Mapa();
        Thread som1 = new Thread(som);
        Thread mapa1 = new Thread(mapa);

        /* som.run();
        mapa.run();

         */
        som1.setPriority(10);
        mapa1.setPriority(1);
        som1.start();
        mapa1.start();

    }
}
