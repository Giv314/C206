public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joao", "123456", "11/03/2001", 1000, 1);
        Funcionario f2 = new Funcionario("Maria", "98765", "01/01/2000", 1000, 2);
        f1.mostraInfo(); // mostra 1000 como salario
        f1.setSalario(10000);
        f1.mostraInfo();
        f2.mostraInfo();

        System.out.println("Numero de funcionarios: " + Funcionario.getNumFunc());

        // Metodos utilitários: o método pow é static: Podemos acessar globalmente
        double potencia = Math.pow(2,3);
        System.out.println(potencia);
    }
}
