public class Professor extends Funcionario{
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
        System.out.println("O(a) professor(a) " + this.getNome() + " está trabalhando");
        System.out.println();
    }

    @Override
    public void salarioBonus() {
        System.out.println("Salario novo do professor: " + this.getSalario() * 1.50);
    }
}
