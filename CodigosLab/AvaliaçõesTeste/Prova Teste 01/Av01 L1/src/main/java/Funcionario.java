public class Funcionario {
    int matricula;
    Pessoa p1 = new Pessoa();

    public Funcionario(int matricula, String nome, String cpf, int idade) {
        this.matricula = matricula;
        this.p1.nome = nome;
        this.p1.cpf = cpf;
        this.p1.idade = idade;
    }
    public Funcionario(){

    }

    void mostraInfo(){
        System.out.println("Matricula do funcionario: " + this.matricula);
        p1.mostraInfo();
    }
}
