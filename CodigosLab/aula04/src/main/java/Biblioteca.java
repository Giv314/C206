public class Biblioteca {
    String nome;
    Livro[] livros = new Livro[100];

    void adicionarLivro(Livro livro){
        for(int i = 0; i < livros.length; i++){
            if(livros[i] == null){
                livros[i] = livro;
                System.out.println("Livro adicionado!");
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Nome da biblioteca: " + nome);
        System.out.println("Informacao dos livros: ");
        for(int i = 0; i < livros.length; i++) {
            if(livros[i] != null) {
                livros[i].mostraInfo();
            }
        }
    }
    boolean alugarLivro(String nomeLivro){
        for(Livro livro: livros){
            if(livro != null){
                if(livro.nome.equals(nomeLivro)){
                    return true;
                }
            }
        }
        return false;
    }


}
