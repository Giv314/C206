import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;


        // Adicionando uma empresa
        Funcionario f1 = new Funcionario();
        Empresa emp = new Empresa("Empresa do Carlos", "123456", "Rua do Carlos");

        boolean flag = true;
        while(flag) {
        System.out.println("Bem vindo ao menu! Digite:");
        System.out.println("0 - adicionar um funcionario na empresa");
        System.out.println("1 - mostrar as informações da empresa e seus funcionarios");
        System.out.println("2 - Calcular e armazenar quantos % dos funcionarios estao disponiveis para trabalhar");
        System.out.println("3- Alocar um funcionario em uma obra");
        System.out.println("Qualquer numero para sair");

        input = sc.nextInt();
            switch (input) {
                case 0 -> emp.adicionarFuncionario(f1);
                case 1 -> emp.mostraInfo();
                case 2 -> {
                    float porc = emp.contarFuncionariosDisponiveis();
                    System.out.println(porc + "% dos funcionarios estão disponiveis");
                }
                case 3 -> {
                    System.out.println("Entre com o index do funcionario: ");
                    int index = sc.nextInt();
                    emp.alocarFuncionario(index);
                }
                default -> {
                    System.out.println("Voce saiu do menu!");
                    flag = false;
                }
            }
        }
        }

    }
