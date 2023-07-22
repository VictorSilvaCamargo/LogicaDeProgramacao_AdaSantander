package Aula01;

import java.util.Scanner;

public class Calculo_Fahrenheit {

    public static double converter_Fahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit para converter para Celsius:");
        double graus = scanner.nextDouble();
        double temperaturaCelsius = converter_Fahrenheit(graus);
        System.out.printf("Graus Fahrenheit: %.2f para graus Celsius: %.2f", graus, temperaturaCelsius);
        scanner.close();
    }
}

