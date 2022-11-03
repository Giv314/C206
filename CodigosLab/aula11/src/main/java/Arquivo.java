import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public String nomeArquivo;
    private OutputStream os;
    private OutputStreamWriter osw;
    private BufferedWriter bf;

    // Leitura
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;

    private String linha;

    public Arquivo(String nomeArquivo){
    this.nomeArquivo = nomeArquivo;
    // Inicializando
    os = null;
    osw = null;
    bf = null;

    is = null;
    isr = null;
    br = null;
    }

    public void escrever(Funcionario funcionario){
        try{
            os = new FileOutputStream(this.nomeArquivo, true);
            osw = new OutputStreamWriter(os);
            bf = new BufferedWriter(osw);
            bf.write("Funcionario");
            bf.newLine();
            bf.write(funcionario.nome + "\n");
            bf.write(String.valueOf(funcionario.idade));
            bf.newLine();
            bf.write(funcionario.cpf + "\n");
            /* bf.write("Primeira frase do arquivo");
            bf.newLine();
            bf.write("Segunda frase do arquivo");
            bf.newLine();

             */
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

    public ArrayList<Funcionario> ler(){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try{
            is = new FileInputStream(this.nomeArquivo);
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linha = br.readLine(); // Faz leitura
            while(linha != null){
                if(linha.contains("Funcionario")){
                    Funcionario f = new Funcionario();
                    f.nome = br.readLine();
                    f.idade =  Integer.parseInt(br.readLine());
                    f.cpf = br.readLine();
                    funcionarios.add(f);
                }
                linha = br.readLine();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return funcionarios;
    }
}
