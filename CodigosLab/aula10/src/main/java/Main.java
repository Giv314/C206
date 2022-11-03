import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SaldoException {
        Conta[] contas = new Conta[3];
        contas[0] = new Conta();
        contas[0].saldo = 300;
        contas[1] = new Conta();
        contas[1].saldo = 700;

        try{
            for (int i = 0; i < contas.length; i++) {
                System.out.println("Saldo em conta: " + contas[i].saldo);
            }
        }catch (NullPointerException e){
            System.out.println(e);
        }
        Scanner sc = new Scanner(System.in);
        int num1 = 30;
        int num2 = 0;
        double resultado = 0;

        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            resultado = (double) num1/num2;
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println("Divisão por zero");
        }catch (InputMismatchException e1){
            System.out.println("Entrou com valor errado.");
        }finally {
            System.out.println("Executando"); // Executa tanto se der exceção, como se não der exceção
        }

        System.out.println("o programa continua");

        // Tratando exceção propria
        contas[0].sacarDeUmJeito(1000);

        try {
            contas[0].sacarDeOutroJeito(2000);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(contas[0].saldo);
    }
}
