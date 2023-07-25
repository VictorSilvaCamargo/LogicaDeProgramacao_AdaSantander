package Aula06;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class EX01 {
    public static void main(String[] args) {
        System.out.println(valorProdutoFinal(250.10, Estado.MG) == 267.607);
        System.out.println(valorProdutoFinal(250.10, Estado.RJ) == 287.615);
        System.out.println(valorProdutoFinal(250.10, Estado.SP) == 280.112);
    }

    public static double valorProdutoFinal(double valorProduto, Estado estado) {
        double taxaImposto = estado.getTaxaImposto();
        double valorProdutoComImposto = valorProduto * (1 + taxaImposto / 100);
        return arredondar(valorProdutoComImposto);
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}