package Aula04;

import java.util.Scanner;

public class EX04 {

    public static int idadeEmDias(int[] input)
    {
        int idadeEmDias = (input[0] * 365) + input[1] * 30 + input[2] ;

        return idadeEmDias;

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] diasVida = new int[3];
        int idadeEmDias;

        System.out.println("Digite quantos anos voce tem:");
        diasVida[0] = scanner.nextInt();

        System.out.println("Digite quantos meses voce tem:");
        diasVida[1] = scanner.nextInt();

        System.out.println("Digite quantos dias voce tem:");
        diasVida[2] = scanner.nextInt();

        idadeEmDias = idadeEmDias(diasVida);

        System.out.println(idadeEmDias);


    }
}

