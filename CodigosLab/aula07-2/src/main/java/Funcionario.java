public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println("O(a) " + this.nome + " está trabalhando");
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario: " + this.salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void salarioBonus(){
        System.out.println("Salario novo: " + this.salario * 1.05);
    }
}
