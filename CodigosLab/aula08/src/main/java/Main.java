public class Main {
    public static void main(String[] args) {
        Arquiteto arquiteto = new Arquiteto("Joao", 21, 1000, "Design");
        Engenheiro engenheiro = new Engenheiro("Ze", 20, 1000, "Computação");
        Professor professor = new Professor("Maria", 25, 2000, "POO");
        // Funcionario funcionario = new Funcionario("Geraldo", 99, 1000) = não funciona, pois, a classe é abstrata

        // Funcionario f2 = engenheiro; // Esse f2 não vai conseguir acessar o fazAlgo da classe engenheiro

        // Polimorfismo
        Funcionario[] funcionarios = new Funcionario[5];
        funcionarios[0] = arquiteto;
        funcionarios[1] = engenheiro; // Não temos acesso a fazAlgo, e nem as implementações de GerenciaProjeto!
        funcionarios[2] = professor;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                if (funcionario instanceof Engenheiro e) { // Quando fazemos downcasting, conseguimos acessar o fazAlgo da classe engenheiro.
                    e.mostraInfo();
                    e.trabalhar();
                    e.gerenciarProjeto();
                    e.finalizarProjeto();
                    e.fazAlgo();
                    System.out.println();
                } else {
                    if (funcionario instanceof Arquiteto a) {
                        a.mostraInfo();
                        a.trabalhar();
                        a.gerenciarProjeto();
                        a.finalizarProjeto();
                        System.out.println();
                    } else {
                        if (funcionario instanceof Professor p) {
                            p.mostraInfo();
                            p.trabalhar();
                            p.prepararAtividade();
                            p.corrigirAtividade();
                            p.Pesquisar("6G");
                            System.out.println();
                        }
                    }

                }
            }

        }
    }
}
