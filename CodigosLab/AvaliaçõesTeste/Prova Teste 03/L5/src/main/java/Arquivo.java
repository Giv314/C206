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

    // Cria o objeto txt
    Arquivo(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }

    // Escreve as infos dos carrinhos em um arquivo txt
    public void escrever(Carrinho carrinho){
        try{
            os = new FileOutputStream(this.nomeArquivo, true);
            osw = new OutputStreamWriter(os);
            bf = new BufferedWriter(osw);
            bf.write("Carrinho");
            bf.newLine();
            bf.write(carrinho.getNomeJogador());
            bf.newLine();
            bf.write(String.valueOf(carrinho.getVelocidade()));
            bf.newLine();
            bf.write(carrinho.getChassi());
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

    public ArrayList<Carrinho> ler(){
        ArrayList<Carrinho> array_carrinho = new ArrayList<>();
        try{
            is = new FileInputStream(this.nomeArquivo);
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linha = br.readLine(); // Faz leitura
            while(linha != null){
                if(linha.contains("Carrinho")){
                    Carrinho c = new Carrinho();
                    c.setNomeJogador(br.readLine());
                    c.setVelocidade(Integer.parseInt(br.readLine()));
                    c.setChassi(br.readLine());
                    array_carrinho.add(c);
                }
                linha = br.readLine();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return array_carrinho;
    }
}
