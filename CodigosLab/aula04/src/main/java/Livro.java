public class Livro {
    String nome;
    int numPaginas;

    public Livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }
    void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero de paginas: " + this.numPaginas);
    }
}
