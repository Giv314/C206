public class SaldoException extends Exception{
    // Se herdamos de exception, somos obrigados a tratar com catch.
    // Já se herdarmos de runtime, não seremos obrigados a tratar.

    public SaldoException(double valor){
        System.out.println("Não foi possivel realizar o saque de " + valor);
    }

}
