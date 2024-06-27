package ExerciciosLista2;
/*3.Média e Desvio Padrão: Escreva um programa que calcule a média e o desvio padrão de um array de números inteiros ou de ponto flutuante.*/

public class Exercicio03 {
    public static void main(String[] args) {

        double [] lista = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double media = calculaMedia(lista);
        double desvioPadrao = calculaDesvioPadrao(lista);

        System.out.println("Média: " + media);
        System.out.println("Desvio Padrão: " + desvioPadrao);
    }

    public static double calculaMedia(double[] array) {
        double soma = 0.0;
        for (double elemento : array) {
            soma += elemento;
        }
        return soma / array.length;
    }

    public static double calculaDesvioPadrao(double[] array) {
        double media = calculaMedia(array);
        double somaQuadrados = 0.0;
        for (double elemento : array) {
            somaQuadrados += (elemento - media) * (elemento - media);
        }

        return Math.sqrt(somaQuadrados / array.length);
    }

}
