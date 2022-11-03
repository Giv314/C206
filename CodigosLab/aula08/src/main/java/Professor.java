
public class Professor extends Funcionario implements Atividade, Pesquisa{
    // É possível implementar mais de uma interface!
    private String materia;
    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Materia: " + this.materia);
    }

    @Override
    public void trabalhar() {
        System.out.println("O(a) professor(a) " + this.nome + " está trabalhando");
        System.out.println();
    }

    @Override
    public void salarioBonus() {
        System.out.println("Salario novo do professor: " + this.salario * 1.50);
    }

    @Override
    public void corrigirAtividade() {
        System.out.println("Professor " + this.nome + " corrigindo atividade");
    }

    @Override
    public void prepararAtividade() {
        System.out.println("Professor " + this.nome + " preparando atividade!");
    }

    @Override
    public void Pesquisar(String projeto) {
        System.out.println("O professor " + this.nome + " está pesquisando sobre o projeto " + projeto);
    }
}
