public class Serie {
    String nome;
    double nota;
    int temporadas;
    boolean finalizada;

    Diretor diretor;
    public Serie(String nome, String nomeDiretor , double nota, int temporadas, boolean finalizada) {
        this.nome = nome;
        this.nota = nota;
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        diretor = new Diretor(nomeDiretor);
    }

    void mostraInfo(){
        System.out.println("Nome da serie " + ": " + this.nome);
        System.out.println("Diretor da serie " + ": " + this.diretor.nome);
        System.out.println("Nota da serie " + ": " + this.nota);
        System.out.println("Temporadas da serie " + ": " + this.temporadas);
        System.out.println("Serie " + "finalizada " + this.finalizada);
    }
}
