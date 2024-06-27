package ExerciciosLista2;
/*1. Ordenação Personalizada: Implemente um algoritmo que ordene um array de objetos com base em um critério personalizado (por exemplo, ordem alfabética de strings ou ordenação numérica).*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        String[] nomes = {
                "Thiago Ariça",
                "Romulo Nougueira",
                "Dennys Andrade",
                "Douglas Ferreira",
                "Anajara Machado",
                "Pedro Augusto",
                "Neto Russo"
        };


        System.out.println("Lista de nomes Original:");
        System.out.println(Arrays.toString(nomes));

        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                ✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨
                Escolha uma opção:
                            
                1 - Ordenar por nome de A a Z
                2 - Ordenar por nome de Z a A

                ✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨✨
                """);

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                Arrays.sort(nomes);
                System.out.println("Lista de nomes Ordenado A->Z:");
                System.out.println(Arrays.toString(nomes));
                break;
            case 2:
                Arrays.sort(nomes, Comparator.comparing(String::toString, String.CASE_INSENSITIVE_ORDER).reversed());
                System.out.println("Lista de nomes Ordenado Z->A:");
                System.out.println(Arrays.toString(nomes));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }


        entrada.close();


    }
}
