import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    // Leitura
    public String nomeArquivo;
    private OutputStream os;
    private OutputStreamWriter osw;
    private BufferedWriter bf;

    // Leitura
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    private String linha;

    Arquivo(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }

    public void escrever(Livro livro){
        try{
            os = new FileOutputStream(this.nomeArquivo, true);
            osw = new OutputStreamWriter(os);
            bf = new BufferedWriter(osw);
            bf.write("Livro");
            bf.newLine();
            bf.write(livro.getNome());
            bf.newLine();
            bf.write(livro.getAutor());
            bf.newLine();
            bf.write(livro.getEditora());
            bf.newLine();
            bf.write(String.valueOf(livro.getnPaginas()));
            bf.newLine();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            try{
                bf.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public ArrayList<Livro> ler(){
        ArrayList<Livro> array_livros = new ArrayList<>();
        try{
            is = new FileInputStream(this.nomeArquivo);
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linha = br.readLine(); // Faz leitura
            while(linha != null){
                if(linha.contains("Livro")){
                    Livro l = new Livro();
                    l.setNome(br.readLine());
                    l.setAutor(br.readLine());
                    l.setEditora(br.readLine());
                    l.setnPaginas(Integer.parseInt(br.readLine()));
                    array_livros.add(l);
                }
                linha = br.readLine();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return array_livros;
    }
}
