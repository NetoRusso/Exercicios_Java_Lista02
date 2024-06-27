package ExerciciosLista2;

/*6. Maior Sequência Crescente: Encontre a maior sequência crescente de números em um array e imprima os números dessa sequência.*/

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio06 {
    public static void main(String[] args) {

        int[] lista = {10, 2, 3, 4, 50, 6, 7, 1, 11, 12};
        encontrarMaiorSC(lista);



    }

    public static void encontrarMaiorSC(int[] array) {
        ArrayList<Integer> atual = new ArrayList<Integer>();
        ArrayList<Integer> maior = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (atual.isEmpty() || array[i] > atual.get(atual.size() - 1)) {
                atual.add(array[i]);
            } else {
                if (atual.size() > maior.size()) {
                    maior = new ArrayList<Integer>(atual);
                }
                atual.clear();
                atual.add(array[i]);
            }
        }

        if (atual.size() > maior.size()) {
            maior = new ArrayList<Integer>(atual);
        }

        System.out.println("A maior sequência crescente é:");
        for (int num : maior) {
            System.out.print(num + " ");
        }

        System.out.println("A lista original é: " + Arrays.toString(array));
    }


}
