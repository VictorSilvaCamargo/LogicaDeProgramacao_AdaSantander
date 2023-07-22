package Aula02;

public class Compra {
    private double total;

    public Compra() {
        total = 0;
    }

    public void adicionarFruta(String fruta, int quantidade) {
        double precoUnitario = 1.45;

        if (quantidade >= 10) {
            precoUnitario = 1.25;
        }

        double precoTotal = precoUnitario * quantidade;
        total += precoTotal;

        System.out.printf("O preço total é: R$%.2f%n", precoTotal);
    }

    public double calcularPrecoTotal() {
        return total;
    }
}
