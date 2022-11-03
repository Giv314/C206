import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Arquivo arquivo = new Arquivo("Funcionarios.txt");
        Funcionario funcionario = new Funcionario("Joao", 21, "222.222.222-22");
        arquivo.escrever(funcionario);
        ArrayList<Funcionario> funcionarios = arquivo.ler();

        for (Funcionario f: funcionarios) {
            System.out.println("Nome do funcionario: " + f.nome);
            System.out.println("Idade do funcionario: " + f.idade);
            System.out.println("cpf do funcionario: " + f.cpf);
        }

         */

        Arquivo arquivo2 = new Arquivo("Funcionarios4.txt");
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int op;

        while (flag){
            System.out.println("1 - Cadastro de um funcionario");
            System.out.println("2 - Mostrar informações dos funcionarios");
            System.out.println("3 - Sair do menu");
            op = input.nextInt();
            switch (op){
                case 1:
                    try {
                        Funcionario f = new Funcionario();
                        input.nextLine();
                        System.out.println("Nome:");
                        f.nome = input.nextLine();
                        System.out.println("Idade:");
                        f.idade = input.nextInt();
                        input.nextLine();
                        System.out.println("cpf:");
                        f.cpf = input.nextLine();
                        arquivo2.escrever(f);
                    } catch (Exception e){
                        System.out.println(e);
                        input.nextLine();
                    }
                    break;
                case 2:
                    try {
                        ArrayList<Funcionario> funcionarios = arquivo2.ler();
                        for (Funcionario func : funcionarios) {
                            System.out.println("Nome do funcionario: " + func.nome);
                            System.out.println("Idade do funcionario: " + func.idade);
                            System.out.println("cpf do funcionario: " + func.cpf);
                        }
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Você saiu do menu!");
                    flag = false;
                    break;
                default:
                    System.out.println("Digite uma opção valida.");
            }
        }

    }
}
