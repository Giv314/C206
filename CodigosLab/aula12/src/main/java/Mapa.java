public class Mapa implements Runnable{
    // Podemos fazemos também, extends Thread. Nesse caso, podemos chamar mapa.start() na main (Pior jeito)
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Gerando mapa");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
