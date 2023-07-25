package Aula06;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dia da semana");
        String diaDaSemanaStr = scanner.nextLine();

        diasDaSemana diaDaSemana = diasDaSemana.fromString(diaDaSemanaStr);
        try {
            if (diaDaSemana != null) {
                System.out.println("Dia da semana: " + diaDaSemana);
            } else {
                throw new DiaDaSemanaInvalidoExeption();
            }
        } catch (DiaDaSemanaInvalidoExeption e){
            System.out.println(e.getMessage());
        }

    }
}

