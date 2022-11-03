public abstract class Funcionario {
    // Classes abstratas, no UML, são representadas em italico
    protected String nome;
    protected int idade;
    protected double salario;
    // Protected: Apenas as classes filhas têm acesso ao atributo/classe

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public abstract void trabalhar(); // A responsabilidade de implementar o método é das classes filhas
    // Elas são obrigadas a implementar!
    // Classes abstratas funcionam como modelos

    public void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario: " + this.salario);
    }

    // Não precisamos mais dos getters e setters, por ser protected!
    public abstract void salarioBonus();
}
