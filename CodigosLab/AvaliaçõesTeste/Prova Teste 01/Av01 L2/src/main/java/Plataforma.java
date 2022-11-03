import java.util.Scanner;

public class Plataforma {
    String nome;
    Serie[] serie;

    public Plataforma(String nome, Serie[] serie) {
        this.nome = nome;
        this.serie = serie;
    }

    void mostraInfo(){
        System.out.println("Plataforma " + this.nome);
        int i = 0;
        while(serie[i] != null) {
            serie[i].mostraInfo();
            i++;
        }
    }

    void addSerie(Serie[] serie){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da serie:");
        String nm = sc.nextLine();
        System.out.println("Digite o nome do diretor: ");
        String nmd = sc.nextLine();
        System.out.println("Digite a nota:");
        double nt = sc.nextDouble();
        System.out.println("Digite o numero de temporadas:");
        int tp = sc.nextInt();
        System.out.println("Digite true se ela foi finalizada ou false se ela nao foi finalizada");
        boolean fn = sc.nextBoolean();

        for(int i = 0; i < serie.length; i++){
            if(serie[i] == null){
                serie[i] = new Serie(nm, nmd, nt, tp, fn);
                break;
            }
        }
    }

    String serieMaisLongaFinalizada(){
        int maiorNm = -1000;
        String nmSerie = null;
        for(int i = 0; i < serie.length; i++){
            if(serie[i] != null && serie[i].temporadas > maiorNm && serie[i].finalizada){
                nmSerie = serie[i].nome;
            }
        }
        return nmSerie;
    }

    void mediaPorcentagem(){
        double media = 0;
        double porc = 0;
        double numSeries = 0;
        double numSeriesTresOuMais = 0;
        double somaNotas = 0;

        for (int i = 0; i < serie.length; i++) {
            if(serie[i] != null){
                numSeries++;
                if(serie[i].temporadas > 2){
                    numSeriesTresOuMais++;
                    somaNotas += serie[i].nota;
                }
            }
        }
        porc = (numSeries/20)*100;
        media = somaNotas/numSeriesTresOuMais;
        System.out.println("Porcentagem: " + porc + "%");
        System.out.println("Media: " + media);
    }

}
