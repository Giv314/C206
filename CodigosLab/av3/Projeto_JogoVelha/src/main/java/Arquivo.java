import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

    public void escrever(String ganhador){
        try{
            Date dataHoraAtual = new Date();
            String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
            String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
            os = new FileOutputStream(this.nomeArquivo, true);
            osw = new OutputStreamWriter(os);
            bf = new BufferedWriter(osw);
            bf.write("Partida");
            bf.newLine();
            bf.write(data + " " + hora);
            bf.newLine();
            bf.write(ganhador);
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

    public ArrayList<Pessoa> ler(){
        ArrayList<Pessoa> lerPessoas = new ArrayList<>();
        try{
            is = new FileInputStream(this.nomeArquivo);
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linha = br.readLine(); // Faz leitura
            while(linha != null){
                if(linha.contains("Partida")){
                    Pessoa p = new Pessoa();
                    p.dataHoraAux = br.readLine();
                    p.nome = br.readLine();
                    lerPessoas.add(p);
                }
                linha = br.readLine();
            }
        }catch (Exception e){
            System.out.println("Nenhuma partida encontrada!");
        }
        return lerPessoas;
    }

    public void deletar(String nomeArquivo){
        Path path = Paths.get(nomeArquivo);
        try {
            boolean result = Files.deleteIfExists(path);
            if (result) {
                System.out.println("Registros deletados com sucesso!");
            }
            else {
                System.out.println("Erro!");
            }
        }
        catch (IOException e) {
            System.out.println("Arquivo sendo usado! Saia e tente novamente");
        }
    }
}
