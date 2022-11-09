public class Pokemon implements Comparable<Pokemon>{
    // Atributos
    private String nome;
    private String tipo;
    private double poder;
    private int nivel;

    // Metodos
    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Poder: " + this.poder);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("----------------------------------");
    }

    // Override para comparação de poder
    @Override
    public int compareTo(Pokemon pokemon) {
        return Double.compare(this.poder, pokemon.poder);
    }

    // Construtores
    public Pokemon(String nome, String tipo, double poder, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.poder = poder;
        this.nivel = nivel;
    }

    public Pokemon(){

    }

    // Getters e setters para atributos private
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
