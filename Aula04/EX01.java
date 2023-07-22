package Aula04;

import java.util.Scanner;

public class EX01 {

    public static double[] custosCarro( double[] input) {

        double[] percentuais = new double[2];

        double precoFabrica = input[0];
        double custoDistribuidor = input[1];
        double precoImpostos = input[2];

        double percentualCustoDistribuidor = (custoDistribuidor / precoFabrica) * 100;
        double percentualCustoImpostos = (precoImpostos / precoFabrica) * 100;

        percentuais[0] = Math.round(percentualCustoDistribuidor * 100.0) / 100.0;
        percentuais[1] = Math.round(percentualCustoImpostos * 100.0) / 100.0;

        return percentuais;

    }

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        double[] Carro1 = new double[3];


        System.out.println("Digite o preço do carro:");
        Carro1[0] = scanner.nextDouble();
        System.out.println("Digite o valor de custo com o distribuidor:");
        Carro1[1] = scanner.nextDouble();
        System.out.println("Digite o valor do preço dos impostos:");
        Carro1[2] = scanner.nextDouble();

        double[] percentuais = custosCarro(Carro1);

        System.out.println("Percentual do custo do distribuidor: " + percentuais[0] + "%");
        System.out.println("Percentual do custo dos impostos: " + percentuais[1] + "%");


    }
}

