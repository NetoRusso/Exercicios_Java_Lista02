package ExerciciosLista2;

/*10. Palíndromos: Verifique se um array de strings contém palavras que são palíndromos (palavras que se leem da mesma forma de trás para frente). */

public class Exercicio10 {
    public static void main(String[] args) {
        String[] palavras = {"radar", "Anotaram a data da maratona", "level", "A missa é péssima", "Ana", "Roma é amor", "Luz azul", "Socorram-me, subi no ônibus em Marrocos"};

        for (String word : palavras) {
            if (isPalindrome(word.toLowerCase()
                    .replace(" ", "" )
                    .replace("é", "e")
                    .replace("-", "")
                    .replace(",", "")
                    .replace("ô" , "o"))) {
                System.out.println(word + " é um palíndromo.");
            } else {
                System.out.println(word + " não é um palíndromo.");
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int len = word.length();

        for (int i = 0; i < len / 2; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}