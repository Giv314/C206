public class Engenheiro extends Funcionario implements GerenciaProjeto{ // Implementando interface
    private String ramo;
    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override // Especialização
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Ramo: " + ramo);
    }

    @Override
    public void trabalhar() {
        System.out.println("O(a) engenheiro(a) " + this.nome + " está trabalhando");
    }

    @Override
    public void salarioBonus() {
        System.out.println("Salario novo do engenheiro: " + this.salario * 1.10);
    }

    public void fazAlgo(){
        System.out.println("O(a) engenheiro " + this.nome + " está fazendo algo");
    }

    @Override
    public void gerenciarProjeto() {
        System.out.println("Engenheiro gerenciando projeto!");
    }

    @Override
    public void finalizarProjeto() {
        System.out.println("Engenheiro finalizou um projeto!");
    }
}
