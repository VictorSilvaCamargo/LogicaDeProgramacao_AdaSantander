package Aula07;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um dia da semana");
            String diaDaSemanaStr = scanner.nextLine();

            DiasDaSemana diaDaSemana = DiasDaSemana.fromString(diaDaSemanaStr);
            System.out.println("Dia da semana: " + diaDaSemana);

        } catch (DiaDaSemanaInvalidoExeption e) {
            System.out.println(e.getMessage());
        }

    }
}
