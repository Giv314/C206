public class Pessoa {
    String nome;
    String cpf;
    int idade;

    void mostraInfo(){
        System.out.println("Nome do funcionario: " + this.nome);
        System.out.println("CPF do funcionario: " + this.cpf);
        System.out.printf("Idade do funcionario: " + this.idade);
        System.out.println("\n");
    }

}
