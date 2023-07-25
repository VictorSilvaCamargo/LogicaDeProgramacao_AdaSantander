package Aula06;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class EX02 {
    public static void main(String[] args) {
        try {
            System.out.println(valorProdutoFinal(250.10, "MG") == 267.607);
            System.out.println(valorProdutoFinal(250.10, "RJ") == 287.615);
            System.out.println(valorProdutoFinal(250.10, "SP") == 280.112);
            valorProdutoFinal(250.10, "DF");
        } catch (EstadoInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double valorProdutoFinal(double valorProduto, String estado) throws EstadoInvalidoException {
        Estado estadoEnum;
        switch (estado.toUpperCase()) {
            case "MG":
                estadoEnum = Estado.MG;
                break;
            case "RJ":
                estadoEnum = Estado.RJ;
                break;
            case "SP":
                estadoEnum = Estado.SP;
                break;
            default:
                throw new EstadoInvalidoException();
        }

        double taxaImposto = estadoEnum.getTaxaImposto();
        double valorProdutoComImposto = valorProduto * (1 + taxaImposto / 100);
        return arredondar(valorProdutoComImposto);
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);
        return Double.parseDouble(decimalFormat.format(numero));
    }
}
