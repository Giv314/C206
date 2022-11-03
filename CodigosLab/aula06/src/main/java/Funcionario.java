public class Funcionario {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private double salario; // Não podemos ter acesso a salario fora da classe funcionario: Encapsulamento
    private int matricula;
    private int tempoServico;
    private static int numFunc; // Static é particular da classe, não do objeto

    // Construtor
    public Funcionario(String nome, String cpf, String dataNascimento, double salario, int tempoServico) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.tempoServico = tempoServico;
        numFunc++;
        this.matricula = numFunc;
    }

    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Salario: " + this.salario);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("\n");
    }

    // Getters e setters servem para acessar, ou modificar um atributo private
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(verificarAumento()){
            this.salario = salario + 10;
        }else{
            this.salario = salario;
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }

    public static int getNumFunc() {
        return numFunc;
    }

    public static void setNumFunc(int numFunc) {
        Funcionario.numFunc = numFunc;
    }

    private boolean verificarAumento(){
        if(this.tempoServico >= 5){
            return true;
        }else{
            return false;
        }
    }
}
