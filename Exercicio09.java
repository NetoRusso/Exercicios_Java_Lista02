package ExerciciosLista2;

/*9. Subconjuntos de Soma Zero: Determine se existe um subconjunto não vazio de elementos em um array cuja soma seja igual a zero. */


import java.util.Arrays;

public class Exercicio09 {

    public static void main(String[] args) {

        int[] lista = {1, 2, 3, 4, -5, 6, -7, 8, 9, 10};

        System.out.println("Lista original: " + Arrays.toString(lista));

        boolean subconjunto = subconjunto(lista);

        System.out.println("Existe subconjunto: " + subconjunto + " ou seja, soma de todos os elementos não é zero");
    }

    public static boolean subconjunto(int[] lista) {
        int soma = 0;
        for (int i = 0; i < lista.length; i++) {
            soma += lista[i];
        }
        return soma == 0;
    }

}
