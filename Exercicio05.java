package ExerciciosLista2;

/*5. Operações de Conjunto: Escreva funções que realizem operações de união, interseção e diferença entre dois arrays.*/


import java.util.Arrays;

public class Exercicio05 {

    public static void main(String[] args) {

        int[] lista1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] lista2 = {2, 4, 5, 6, 8, 9, 10, 11, 7, 12};

        int[] listaUniao = uniao(lista1, lista2);
        int[] listaIntersecao = intersecao(lista1, lista2);
        int [] listaDiferenca = uniao(diferenca(lista1, lista2), diferenca(lista2, lista1));

        System.out.println("Lista 01 : " + Arrays.toString(lista1));
        System.out.println("Lista 02 : " + Arrays.toString(lista2));
        System.out.println("listaUniao = " + Arrays.toString(listaUniao));
        System.out.println("listaIntersecao = " + Arrays.toString(listaIntersecao));
        System.out.println("listaDiferenca = " + Arrays.toString(listaDiferenca));

    }

    public static int[] uniao(int[] lista1, int[] lista2) {
        int[] listaUniao = new int[lista1.length + lista2.length];
        int indiceUniao = 0;
        for (int i = 0; i < lista1.length; i++) {
            listaUniao[indiceUniao] = lista1[i];
            indiceUniao++;
        }
        for (int i = 0; i < lista2.length; i++) {
            listaUniao[indiceUniao] = lista2[i];
            indiceUniao++;
        }

        return listaUniao;
    }

    public static int[] intersecao(int[] lista1, int[] lista2) {

        int contador1 = 0;
        for (int i = 0; i < lista1.length; i++) {
            for (int j = 0; j < lista2.length; j++) {
                if (lista1[i] == lista2[j]) {
                    contador1++;

                }
            }
        }

        int[] listaIntersecao = new int[contador1];
        int indiceIntersecao = 0;

        for (int i = 0; i < lista1.length; i++) {
            for (int j = 0; j < lista2.length; j++) {
                if (lista1[i] == lista2[j]) {
                    listaIntersecao[indiceIntersecao] = lista1[i];
                    indiceIntersecao++;
                }
            }
        }

        return listaIntersecao;
    }

    public static int[] diferenca(int[] array1, int[] array2) {

        int contador = 0;
        for (int i = 0; i < array1.length; i++) {
            int elemento = array1[i];
            if (!contem(array2, elemento)) {
                contador++;
            }
        }

        int [] listaDiferenca = new int[contador];
        int indiceDiferenca = 0;

        for (int i = 0; i < array1.length; i++) {
            int elemento = array1[i];

            if (!contem(array2, elemento)) {
                listaDiferenca[indiceDiferenca] = elemento;
                indiceDiferenca++;
            }

        }

        return listaDiferenca;
    }

    public static boolean contem(int[] array1, int valor) {
        for (int i = 1; i < array1.length; i++) {
            for (int item : array1) {
                if ( item == valor) {
                    return true;

                }
            }
        }
        return false;
    }


}
