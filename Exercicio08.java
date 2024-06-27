package ExerciciosLista2;

/*8. Histograma de Frequência: Construa um histograma de frequência a partir de um array de números, mostrando quantas vezes cada número aparece. */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercicio08 {

    public static void main(String[] args) {
        int[] lista = {1, 5, 3, 4, 5, 7, 7, 8, 9, 3};
        Map<Integer, Integer> frequencia = frequencia(lista);

        System.out.println("Lista original: " + Arrays.toString(lista));
        System.out.println("Frequencia: " + frequencia);
    }

    public static Map<Integer, Integer> frequencia(int[] lista) {
        Map<Integer, Integer> frequencia = new HashMap<>();
        for (int numero : lista) {
            if (frequencia.containsKey(numero)) {
                frequencia.put(numero, frequencia.get(numero) + 1);
            } else {
                frequencia.put(numero, 1);
            }
        }
        return frequencia;
    }
}