import java.util.Scanner;

public class CriaJogo {
    private Scanner sc = new Scanner(System.in);
    public static Pessoa p1;
    public static Pessoa p2;

    public boolean escolheSimbolo(String pess) {
        System.out.println(pess + ", escolha entre O ou X: ");
        try {
            p1.simbolo = sc.nextLine();
            if (p1.simbolo.equals("X")) {
                p1.simbolo = "X";
                p2.simbolo = "O";
            } else {
                if (p1.simbolo.equals("O")) {
                    p1.simbolo = "O";
                    p2.simbolo = "X";
                } else {
                    throw new JogoException("Simbolo invalido.");
                }
            }
        } catch (JogoException se) {
            return false;
        }
        return true;
    }
}
