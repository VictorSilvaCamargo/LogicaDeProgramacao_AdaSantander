package ParesImpares;

import java.util.Arrays;

public class ParesImpares {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int[] pares = new int[3];
        int[] impares = new int[3];
        int paresIndex = 0;
        int imparesIndex = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[paresIndex] = numeros[i];
                paresIndex++;
            } else {
                impares[imparesIndex] = numeros[i];
                imparesIndex++;
            }
        }

        pares = sortAscendingOrder(pares);
        impares = sortAscendingOrder(impares);

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }

    public static int[] sortAscendingOrder(int[] lista) {
        int[] listaOrdenada = Arrays.copyOf(lista, lista.length);

        for (int i = 0; i < listaOrdenada.length - 1; i++) {
            for (int j = 0; j < listaOrdenada.length - i - 1; j++) {
                if (listaOrdenada[j] > listaOrdenada[j + 1]) {
                    int temp = listaOrdenada[j];
                    listaOrdenada[j] = listaOrdenada[j + 1];
                    listaOrdenada[j + 1] = temp;
                }
            }
        }

        return listaOrdenada;
    }
}

