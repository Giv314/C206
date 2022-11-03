public class Main {

    // SEMPRE CRIAR O METODO MAIN!
    public static void main(String[] args) {
        Trabalhador trab1;   // trab1 é um ponteiro
        Trabalhador trab2;


        trab1 = new Trabalhador(); // Instanciando trab1
        trab2 = new Trabalhador("Fulano", 20, "987654321", 530);

        //Atributos do funcionario
        trab1.nome = "Joao";
        trab1.idade = 21;
        trab1.salario = 500;
        trab1.cpf = "123456789";


        // Invocando metodos do funcionario
        trab1.mostraInfo();
        trab1.tirarFerias();
        System.out.println("O salario do " + trab1.nome + " é: " + trab1.calculaSalarioAnual());
        System.out.println("O salario do " + trab2.nome + " é: " + trab2.calculaSalarioAnual(true));
        trab2.mostraInfo();
    }

}
