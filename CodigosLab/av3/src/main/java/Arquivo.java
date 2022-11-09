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

    public void escrever(Pokemon pokemon){
        try{
            os = new FileOutputStream(this.nomeArquivo, true);
            osw = new OutputStreamWriter(os);
            bf = new BufferedWriter(osw);
            bf.write("Pokemon");
            bf.newLine();
            bf.write(pokemon.getNome());
            bf.newLine();
            bf.write(pokemon.getTipo());
            bf.newLine();
            bf.write(String.valueOf(pokemon.getPoder()));
            bf.newLine();
            bf.write(String.valueOf(pokemon.getNivel()));
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

    // Metodo para ler o arquivo e salvar os pokemon
    public ArrayList<Pokemon> ler(){
        ArrayList<Pokemon> array_pokemon = new ArrayList<>();
        try{
            is = new FileInputStream(this.nomeArquivo);
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linha = br.readLine(); // Faz leitura
            while(linha != null){
                if(linha.contains("Pokemon")){
                    Pokemon p = new Pokemon();
                    p.setNome(br.readLine());
                    p.setTipo(br.readLine());
                    p.setPoder(Double.parseDouble(br.readLine()));
                    p.setNivel(Integer.parseInt(br.readLine()));
                    array_pokemon.add(p);
                }
                linha = br.readLine();
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return array_pokemon;
    }
}
