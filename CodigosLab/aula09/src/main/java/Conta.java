public class Conta implements Comparable<Conta> {
    private String dono;
    private double saldo;

    public Conta(String dono, double saldo){
        this.dono = dono;
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public int compareTo(Conta conta) {
        return Double.compare(this.saldo, conta.saldo);
    }
}
