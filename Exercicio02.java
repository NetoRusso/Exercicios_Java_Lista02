package ExerciciosLista2;

/*2.Fusão de Arrays: Crie um método que receba dois arrays de inteiros ordenados e os funda em um único array ordenado.*/


import java.util.Arrays;

public class Exercicio02 {

    public static void main(String[] args) {

        int[] lista1 = {1, 2, 3, 4, 5};
        int[] lista2 = {6, 7, 8, 9, 10};


        System.out.println("Lista 1: " + Arrays.toString(lista1));
        System.out.println("Lista 1: " + Arrays.toString(lista1));

        int[] resultado = fusao( lista1,  lista2);
        System.out.println("Lista Fundida : " + Arrays.toString(resultado));
    }

    public static int[] fusao(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        while (j < array2.length) {
            result[k++] = array2[j++];
        }
        return result;
    }

}
