public class Arquiteto extends Funcionario{
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
        System.out.println("O(a) arquiteto(a) " + this.getNome() + " está trabalhando");
    }

    @Override
    public void salarioBonus() {
        System.out.println("Salario novo do arquiteto: " + this.getSalario() * 1.15);
    }
}
