import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList(); // Lista heterogênea (Tem vários tipos)

        Conta c = new Conta("Maria", 1000);
        lista.add(10);
        lista.add("Joao");
        lista.add(150.0);
        lista.add(c);

        // System.out.println(lista); [10, Joao, 150.0, Conta@1134affc]

        lista.remove(c);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)); // Array: lista[i]
            /* 10
            Joao
            150.0
            Conta@1134affc*/

        }

        // Trabalhando com lista homogenea

        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(20);
        inteiros.add(5);
        inteiros.add(7);
        inteiros.add(31);
        System.out.println(inteiros);

        // Removendo elemento
        inteiros.remove(1);

        System.out.println("Antes da ordenação:");
        for (int i = 0; i < inteiros.size(); i++) {
            System.out.println(inteiros.get(i));
        }

        // Ordenando a lista
        Collections.sort(inteiros);
        System.out.println("Depois da ordenação:");
        System.out.println(inteiros);

        // Em ordem decrescente:
        Collections.reverse(inteiros);
        System.out.println(inteiros);

        // Lista de contas
        ArrayList<Conta> contas = new ArrayList<>();
        Conta c1 = new Conta("Joao", 150.0);
        Conta c2 = new Conta("Maria", 1500);
        Conta c3 = new Conta("Jose", 1000);
        Conta c4 = new Conta("Ana", 15);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);

        System.out.println("Continhas:");

        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Nome: " + contas.get(i).getDono());
            System.out.println("Saldo: " + contas.get(i).getSaldo());
        }

        System.out.println("Ordenando contas em relação ao nome:");
        Collections.sort(contas); // Chama os métodos da interface Comparable
        // Collections.reverse(contas) faria em ordem decrescente

        System.out.println("Ordenando em relação ao saldo:");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Nome: " + contas.get(i).getDono());
            System.out.println("Saldo: " + contas.get(i).getSaldo());
        }

        // Mostrando o index de uma conta especifica
        System.out.println(contas.indexOf(c1));

        HashMap<Conta, Integer> mapa = new HashMap<>();
        // String: Valor
        // Integer: chave

        mapa.put(c1, 12);
        mapa.put(c2, 20);
        mapa.put(c3, 35);

        System.out.println("---------------------------");
        System.out.println("Elementos do mapa:");
        System.out.println(mapa);
        System.out.println(mapa.get(c1));
        System.out.println(mapa.size());
        System.out.println(mapa.values());

        System.out.println("-------------------");
        System.out.println("hash_set:");
        HashSet<Integer> inteiros2 = new HashSet<>();
        inteiros2.add(10);
        inteiros2.add(10); // Não é adicionado, pois é repetido
        inteiros2.add(25);
        inteiros2.add(30);
        System.out.println(inteiros2);

    }

    }
