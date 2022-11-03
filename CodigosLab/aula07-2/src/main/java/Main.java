public class Main {
    public static void main(String[] args) {
        Arquiteto arquiteto = new Arquiteto("Joao", 21, 1000, "Design");
        Engenheiro engenheiro = new Engenheiro("Ze", 20, 1000, "Computação");
        Professor professor = new Professor("Maria", 25, 2000, "POO");
        Funcionario funcionario = new Funcionario("Geraldo", 99, 1000);

        // Funcionario f2 = engenheiro; // Esse f2 não vai conseguir acessar o fazAlgo da classe engenheiro

        // Polimorfismo
        Funcionario[] funcionarios = new Funcionario[5];
        funcionarios[0] = arquiteto;
        funcionarios[1] = engenheiro;
        funcionarios[2] = professor;

        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i] != null){
                if(funcionarios[i] instanceof Engenheiro){
                    Engenheiro e = (Engenheiro) funcionarios[i];
                    e.mostraInfo();
                    e.trabalhar();
                    e.fazAlgo(); // Quando fazemos downcasting, conseguimos acessar o fazAlgo da classe engenheiro.
                    System.out.println();
                }

            }
        }

    }
}
