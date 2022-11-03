import java.util.ArrayList;

public class Tabuleiro {
    public ArrayList<String> simbolos = new ArrayList();
    public ArrayList<Integer> numeros = new ArrayList<>();

    public void criaTabuleiro(){
        for (int i = 0; i < 9; i++) {
            simbolos.add(" ");
        }
        for (int i = 0; i < 9; i++) {
            numeros.add(0);
        }
    }

    public void mostraTabuleiro(){
        for (int i = 0; i < 9; i++) {
            System.out.print(simbolos.get(i));
            System.out.print("  ");
            if(i == 2 || i == 5 || i == 8){
                System.out.println("\n");
            }
        }
    }

    public void colocarSimbolo(int pos, int tipoJogador, String op){
        simbolos.set(pos, op);
        numeros.set(pos, tipoJogador);
    }

    public boolean percorreArray(){
        for (int i = 0; i < simbolos.size(); i++) {
            if(simbolos.get(i).equals(" ")){
                return false;
            }
        }
        return true;
    }

    public String checar(String pessoa){ // Problema
        Integer soma = 0;
        Integer soma2 = 0;
        Integer soma3 = 0;
        Integer soma4 = 0;
        Integer soma5 = 0;
        Integer soma6 = 0;

        // Checa linhas
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
            if(i == 2 || i == 5 || i == 8){
                if(soma == 3){
                    return pessoa;
                }else{
                    if(soma == 6){
                        return "Computador";
                    }
                }
                soma = 0;
            }

            // Checando colunas
            if(i == 0 || i == 3 || i == 6){
                soma2 += numeros.get(i);
            }
            if(i == 1 || i == 4 || i == 7){
                soma3+= numeros.get(i);
            }
            if(i == 2 || i == 5 || i == 8){
                soma4 += numeros.get(i);
            }

            // Checando diagonais
            if(i == 0 || i == 4 || i == 8){
                soma5 += numeros.get(i);
            }
            if(i == 2 || i == 4 || i == 6){
                soma6 += numeros.get(i);
            }
        }

        if(soma2.equals(3) || soma3.equals(3) || soma4.equals(3) || soma5.equals(3) || soma6.equals(3)){
            return pessoa;
        }else{
            if(soma2.equals(6) || soma3.equals(6) || soma4.equals(6) || soma5.equals(6) || soma6.equals(6)){
                return "Computador";
            }
        }
        return "Deu empate!";
    }
}
