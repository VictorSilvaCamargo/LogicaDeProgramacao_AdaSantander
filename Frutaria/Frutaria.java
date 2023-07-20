package Frutaria;

import java.util.Scanner;

public class Frutaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Compra compra = new Compra();

        while (true) {
            System.out.print("Digite o nome da fruta (ou 'parar' para finalizar): ");
            String fruta = scanner.nextLine();

            if (fruta.equalsIgnoreCase("parar")) {
                break;
            }

            System.out.print("Digite a quantidade de frutas: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            compra.adicionarFruta(fruta, quantidade);
        }

        double precoTotal = compra.calcularPrecoTotal();
        System.out.printf("O preço total da compra é: R$%.2f%n", precoTotal);
    }
}

