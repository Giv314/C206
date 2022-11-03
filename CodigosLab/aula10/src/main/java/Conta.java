public class Conta {
    double saldo;

    public void sacarDeUmJeito(double valor){
        try{
            if(this.saldo < valor){
                throw new SaldoException(valor);
            }else{
                this.saldo -= valor;
            }
        }catch (SaldoException e){
            System.out.println(e);
        }finally {
            System.out.println("Sacar de um jeito finalizado!");
        }
    }

    public void sacarDeOutroJeito(double valor) throws SaldoException{
        if(this.saldo < valor){
            throw new SaldoException(valor);
        }else{
            this.saldo -= valor;
        }
        // System.out.println("Sacar de outro jeito finalizado!");
    }
}
