package Aula02;

import java.util.Arrays;

public class OrdenarNumeros {

    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
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

    public static int[] sortDescendingOrder(int[] lista) {
        int[] listaOrdenada = Arrays.copyOf(lista, lista.length);

        for (int i = 0; i < listaOrdenada.length - 1; i++) {
            for (int j = 0; j < listaOrdenada.length - i - 1; j++) {
                if (listaOrdenada[j] < listaOrdenada[j + 1]) {
                    int temp = listaOrdenada[j];
                    listaOrdenada[j] = listaOrdenada[j + 1];
                    listaOrdenada[j + 1] = temp;
                }
            }
        }

        return listaOrdenada;
    }

}

