package Aula04;

public class EX05 {

    public static int primeiroCaractereUnico(String input) {
        int[] ocorrencias = new int[256];


        for (int i = 0; i < 256; i++) {
            ocorrencias[i] = 0;
        }


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            ocorrencias[c]++;
        }


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (ocorrencias[c] == 1) {
                return i;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        String palavra = "amor";
        int indice = primeiroCaractereUnico(palavra);

        System.out.println("Entrada: " + palavra);
        System.out.println("Saída: " + indice);
    }
}
