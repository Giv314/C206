import java.util.Scanner;

public class CriaJogo {
    private Scanner sc = new Scanner(System.in);
    public static String op;
    public static String op2;
    public static Computador computador;
    public static Pessoa p1;

    public boolean escolheSimbolo() {
        System.out.println("Escolha entre O ou X: ");
        try {
            op = sc.nextLine();
            if (op.equals("X")) {
                op2 = "O";
            } else {
                if (op.equals("O")) {
                    op2 = "X";
                } else {
                    throw new JogoException("Simbolo invalido.");
                }
            }
        } catch (JogoException se) {
            return false;
        }
        computador = new Computador("O");
        p1 = new Pessoa(op);
        return true;
    }
}
