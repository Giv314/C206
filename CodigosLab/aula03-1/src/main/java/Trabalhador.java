public class Trabalhador {
    public String nome;
    public int idade;
    public String cpf;
    public double salario;

    void mostraInfo(){
        System.out.println("Nome: " + this.nome); // This referencia quem instanciou esse objeto
        System.out.println("Idade: " + this.idade);
        System.out.println("Cpf: "+ this.cpf);
        System.out.println("Salario: " + this.salario);
    }
    void tirarFerias(){
        System.out.println("O(a) " + this.nome + " está tirando ferias");
    }

    double calculaSalarioAnual(){
        return this.salario * 12;
    }

    double calculaSalarioAnual(boolean teste){
        if(teste)
            return this.salario*13;
        else
            return this.salario*12;
    }

    public Trabalhador() {
        System.out.println("Trabalhador contratado!");
    }

    // Sobrecarga de metodos = 2 metodos com mesmo nome, porem com parametros diferentes
    public Trabalhador(String nome, int idade, String cpf, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
    }
}
