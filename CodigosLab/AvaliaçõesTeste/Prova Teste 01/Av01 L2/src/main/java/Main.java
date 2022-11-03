import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Serie[] series = new Serie[20];
        Plataforma p1 = new Plataforma("P01", series);
        boolean flag = true;

        while(flag) {
            System.out.println("Bem vindo ao menu! Digite");
            System.out.println("0 - Adicionar serie na plataforma");
            System.out.println("1 - Mostrar infos da plataforma e suas series");
            System.out.println("2 - Mostrar o nome da serie com maior numero de temporadas ja finalizadas");
            System.out.println("3 - Mostra a porcentagem do num de series e a media das notas que possuem 3 ou mais temporadas");
            System.out.println("Qualquer numero para sair");

            op = sc.nextInt();

            switch (op) {
                case 0: // Adicionar serie na plataforma
                    p1.addSerie(series);
                    System.out.println("Serie adicionada!");
                    break;
                case 1: // Mostrar infos da plataforma e suas series
                    p1.mostraInfo();
                    break;
                case 2: // Mostrar info da serie com maior numero de temporadas ja finalizadas
                    String serieLnFn = p1.serieMaisLongaFinalizada();
                    if(serieLnFn != null) {
                        System.out.println("A serie " + serieLnFn + " é a mais longa finalizada");
                    }else{
                        System.out.println("Não existe!");
                    }
                    break;
                case 3: // Mostra a porcentagem do num de series e a media das notas que possuem 3 ou mais temporadas
                    p1.mediaPorcentagem();
                    break;
                default:
                    System.out.println("Voce saiu do menu!");
                    flag = false;
                    break;
            }
        }
    }
}
