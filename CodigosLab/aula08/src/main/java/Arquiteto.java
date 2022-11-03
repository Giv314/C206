public class Arquiteto extends Funcionario implements GerenciaProjeto{
    private String especialidade;
    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario); // Referencia a super-classe, no caso, o funcionario
        this.especialidade = especialidade;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Especialidade: " + this.especialidade);
    }

    @Override
    public void trabalhar() {
        System.out.println("O(a) arquiteto(a) " + this.nome + " está trabalhando");
    }

    @Override
    public void salarioBonus() {
        System.out.println("Salario novo do arquiteto: " + this.salario * 1.15);
    }

    @Override
    public void gerenciarProjeto() {
        System.out.println("Arquiteto gerenciando projeto!");
    }

    @Override
    public void finalizarProjeto() {
        System.out.println("O arquiteto finalizou um projeto");
    }
}
