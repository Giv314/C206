import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variaveis auxiliares
        String nomeAux;
        String tipoAux;
        double poderAux;
        int nivelAux;
        // ArrayList que checa os valores para tipos de pokemon
        ArrayList<String> tipoAuxArray = new ArrayList<>();
        tipoAuxArray.add("Agua");
        tipoAuxArray.add("Terra");
        tipoAuxArray.add("Eletrico");
        tipoAuxArray.add("Fogo");
        tipoAuxArray.add("Lutador");

        // Criando o arquivo
        Arquivo arquivo = new Arquivo("Pokemons");
        // ArrayList auxiliar para mostrar infos dos pokemons salvos
        ArrayList<Pokemon> pokemons_aux;
        // Criando scanner e variaveis de controle do menu
        Scanner sc = new Scanner(System.in);
        boolean key = false;
        int opcao;

        // Criando Menu
        while (!key) {
            System.out.println("Bem vindo ao menu! Escolha:");
            System.out.println("1 - Salvar informações do pokemon no arquivo txt");
            System.out.println("2 - Mostrar informações dos pokemons salvos no arquivo txt");
            System.out.println("3 - Ordenar os pokemons em ordem crescente de poder");
            System.out.println("4 - Ordenar os pokemons em ordem decrescente de poder");
            System.out.println("Qualquer digito para sair");
            try{
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        try {
                            System.out.println("Nome: ");
                            sc.nextLine();
                            nomeAux = sc.nextLine();
                            System.out.println("Tipo:");
                            tipoAux = sc.nextLine();
                            // Verificando se o tipo é valido
                            if(tipoAuxArray.contains(tipoAux)){
                                System.out.println("Poder:");
                                poderAux = sc.nextDouble();
                                // Verificando se o poder é válido
                                if(poderAux <= 0){
                                    throw new ValorInvalidoException("Poder menor ou igual a zero!");
                                }else{
                                    System.out.println("Nivel:");
                                    nivelAux = sc.nextInt();
                                    // Verificando se o nivel é válido
                                    if(nivelAux <= 0 ){
                                        throw new ValorInvalidoException("Nivel menor ou igual a zero");
                                    }else{ // Se todas as condições foram satisfeitas
                                        Pokemon pokemon1 = new Pokemon(nomeAux, tipoAux, poderAux, nivelAux);
                                        arquivo.escrever(pokemon1); // Escrevendo o pokemon no arquivo txt
                                    }
                                }
                            }else{
                                throw new ValorInvalidoException("Tipo inválido!");
                            }
                        } catch (Exception e) { // Tratando exceções
                            System.out.println(e);
                            break;
                        }
                        break;
                    case 2:
                        // Lendo as infos dos pokemons do txt
                        pokemons_aux = arquivo.ler();
                        for (Pokemon pokemon : pokemons_aux) {
                            pokemon.mostraInfo();
                        }
                        break;
                    case 3:
                        // Ordenando os pokemnos
                        pokemons_aux = arquivo.ler();
                        Collections.sort(pokemons_aux);
                        for (Pokemon pokemon : pokemons_aux) {
                            pokemon.mostraInfo();
                        }
                        break;
                    case 4:
                        // Ordenando em ordem decrescente
                        pokemons_aux = arquivo.ler();
                        Collections.sort(pokemons_aux);
                        Collections.reverse(pokemons_aux);
                        for (Pokemon pokemon : pokemons_aux) {
                            pokemon.mostraInfo();
                        }
                        break;
                    default:
                        System.out.println("Você saiu do programa!");
                        key = true;
                }
            }catch(Exception e){ // Tratando exceção no menu
                System.out.println(e);
                break;
            }
        }
    }
}
