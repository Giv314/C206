public class Livro implements Comparable<Livro> {
    private String nome;
    private String autor;
    private String editora;
    private int nPaginas;

    public Livro(String nome, String autor, String editora, int nPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.nPaginas = nPaginas;
    }
    Livro(){

    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Numero de paginas: " + nPaginas);
    }



    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    @Override
    public int compareTo(Livro o) {
        return Integer.compare(this.nPaginas, o.nPaginas);
    }
}
