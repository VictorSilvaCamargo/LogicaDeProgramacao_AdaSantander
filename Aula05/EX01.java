package Aula05;

import java.util.Scanner;

public class EX01 {
    public static double custoCompra(int quantidade) {
        double total;
        if (quantidade >= 10) {
            total = quantidade * 1.25;
        } else {
            total = quantidade * 1.45;
        }
        return total;
    }

    public static void checkQuantidade(int quantidade) throws QuantidadeException, QuantidadeNegativaException {
        if (quantidade == 0) {
            throw new QuantidadeException();
        } else if (quantidade < 0) {
            throw new QuantidadeNegativaException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePera;
        int quantidadeMaca;
        int quantidadeLaranja;
        int quantidadeTomate;
        int quantidadeCaqui;

        System.out.println("Bem Vindo a frutaria da Maria!");
        System.out.println("Essas são as frutas disponíveis:");
        System.out.println("Pera | Maçã | Laranja | Tomate | Caqui ");
        System.out.println("Estamos com promoção!!! \n a cada 10 frutas ou mais cada uma sai por R$ 1,25! \n Caso menos de 10, cada uma sai por R$ 1,45.");

        try {
            System.out.println("Digite quantas Peras voce vai querer?:");
            quantidadePera = scanner.nextInt();
            checkQuantidade(quantidadePera);

            System.out.println("Digite quantas Maçãs voce vai querer?:");
            quantidadeMaca = scanner.nextInt();
            checkQuantidade(quantidadeMaca);

            System.out.println("Digite quantas Laranjas voce vai querer?:");
            quantidadeLaranja = scanner.nextInt();
            checkQuantidade(quantidadeLaranja);

            System.out.println("Digite quantas Tomates voce vai querer?:");
            quantidadeTomate = scanner.nextInt();
            checkQuantidade(quantidadeTomate);

            System.out.println("Digite quantas Caquis voce vai querer?:");
            quantidadeCaqui = scanner.nextInt();
            checkQuantidade(quantidadeCaqui);

            System.out.println("Custo total da compra: R$ " + (custoCompra(quantidadePera) + custoCompra(quantidadeMaca) +
                    custoCompra(quantidadeLaranja) + custoCompra(quantidadeTomate) + custoCompra(quantidadeCaqui)));
        } catch (QuantidadeException | QuantidadeNegativaException e) {
            System.out.println(e.getMessage());
        }
    }
}
