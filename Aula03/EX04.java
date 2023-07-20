package Aula03;

public class EX04 {

    public static int primeiroCaractereUnico(String input) {
        int[] ocorrencias = new int[256];


        for (char c : input.toCharArray()) {
            ocorrencias[c]++;
        }


        for (int i = 0; i < input.length(); i++) {
            if (ocorrencias[input.charAt(i)] == 1) {
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
