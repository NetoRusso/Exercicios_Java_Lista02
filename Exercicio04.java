package ExerciciosLista2;

/*4. Pesquisa em Matriz: Implemente um método para pesquisar um elemento em uma matriz multidimensional e retorne sua posição ou um indicativo de não encontrado. */


import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        /*
        System.out.print(matriz[0][1]);
        System.out.print(matriz[2][1]);
        System.out.print(matriz[1][0]);
        System.out.print(matriz[1][2]);
        */

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número a ser pesquisado: ");

        int numero = entrada.nextInt();
        String posicao = pesquisa(matriz, numero);
        System.out.println(posicao);

        entrada.close();
    }

    public static String pesquisa(int[][] matriz, int elemento) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == elemento) {
                    return "Elemento encontrado na posição (" + i + ", " + j + ")";
                }
            }
        }
        return "Elemento não encontrado";

    }

}
