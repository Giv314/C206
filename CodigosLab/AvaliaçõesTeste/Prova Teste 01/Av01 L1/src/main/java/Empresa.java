import java.util.Scanner;

public class Empresa {
    String nome;
    String cnpj;
    String endereco;
    int funcionariosDisponiveis = 0;
    Funcionario[] f1 = new Funcionario[20];

    public Empresa(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    void mostraInfo(){
        System.out.println("Nome da empresa: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        for (int i = 0; i < f1.length; i++) {
            if(f1[i] != null) {
                f1[i].mostraInfo();
            }
        }
    }

    void adicionarFuncionario(Funcionario func) {
        System.out.println("Entre com a matricula: ");
        Scanner sc = new Scanner(System.in);
        int matricula = sc.nextInt();
        System.out.println("Entre com o nome:");
        nome = sc.nextLine();
        sc.nextLine();
        System.out.println("Entre com o cpf:");
        String cpf = sc.nextLine();
        System.out.println("Entre com a idade:");
        int idade = sc.nextInt();
        func = new Funcionario(matricula, nome, cpf, idade);
        for(int i = 0; i<f1.length; i++){
            if(f1[i] == null){
                f1[i] = func;
                break;
            }
        }
        System.out.println("Funcionario " + func.p1.nome + " adicionado!");
        }
    void alocarFuncionario(int index){
            if(f1[index] != null) {
                System.out.println("Funcionario" + f1[index].p1.nome + " alocado!");
            }else{
                System.out.println("Posicao invalida!");
        }
    }
    float contarFuncionariosDisponiveis(){
        float porcentagemDisponiveis;
        for(int i = 0; i< f1.length; i++){
            if(f1[i] != null){
                funcionariosDisponiveis++;
            }
        }
        porcentagemDisponiveis = (funcionariosDisponiveis/20.0f)*100;
        return porcentagemDisponiveis;
    }

}
