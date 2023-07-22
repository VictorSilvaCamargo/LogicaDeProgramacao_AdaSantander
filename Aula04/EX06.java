package Aula04;

import java.util.Scanner;

public class EX06 {

    public static boolean elementosRepetidos(double[] input)
    {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantidade;
        boolean duplicatas;

        System.out.println("digite a quantidade de elementos que queira digitar: ");
        quantidade = scanner.nextInt();

        double[] numeros =  new double[quantidade];

        System.out.println("Digite os elementos do array:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
        }

        duplicatas =  elementosRepetidos(numeros);

        if(duplicatas){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
