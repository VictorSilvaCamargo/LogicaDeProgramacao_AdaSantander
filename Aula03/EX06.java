package Aula03;

import java.util.Scanner;

public class EX06 {

    public static boolean verificarTriangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double formulaHeron(double a, double b, double c) {
        if (verificarTriangulo(a, b, c)) {
            double p = (a + b + c) / 2;
            double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return resultado;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        double lado1;
        double lado2;
        double lado3;
        double resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo:");
        lado1 = scanner.nextDouble();

        System.out.println("Digite o segundo lado do triângulo:");
        lado2 = scanner.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo:");
        lado3 = scanner.nextDouble();

        resultado = formulaHeron(lado1, lado2, lado3);

        if (resultado >= 0) {
            System.out.printf("A área do triângulo é: %.2f cm²", resultado);
        } else {
            System.out.println("As medidas não formam um triângulo válido.");
        }
    }
}

