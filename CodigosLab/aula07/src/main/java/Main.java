public class Main {
    public static void main(String[] args) {
        Arquiteto arquiteto = new Arquiteto("Joao", 21, 1000, "Design");
        Engenheiro engenheiro = new Engenheiro("Ze", 20, 1000, "Computação");
        Professor professor = new Professor("Maria", 25, 2000, "POO");
        Funcionario funcionario = new Funcionario("Geraldo", 99, 1000);

        arquiteto.mostraInfo();
        engenheiro.mostraInfo();
        professor.mostraInfo();

        engenheiro.trabalhar();
        arquiteto.trabalhar();

        arquiteto.salarioBonus();
        engenheiro.salarioBonus();
        professor.salarioBonus();

        System.out.println();
        funcionario.mostraInfo();
        funcionario.trabalhar();
        funcionario.salarioBonus();
    }
}
