package Aula04;

import java.util.Scanner;

public class EX02 {

    public static double calculoSalario(double[] input) {
        double tempoServico = input[0];
        double inflacao = input[1];
        double salario = input[2];

        double reajusteTempoServico = 0.0;
        if (tempoServico >= 1 && tempoServico <= 5) {
            reajusteTempoServico = 0.01;
        } else if (tempoServico > 5 && tempoServico < 10) {
            reajusteTempoServico = 0.015;
        } else if (tempoServico >= 10) {
            reajusteTempoServico = 0.02;
        }

        double reajusteTotal = reajusteTempoServico + inflacao / 100.0;
        double novoSalario = salario + salario * reajusteTotal;

        // Arredonda o novoSalario para duas casas decimais
        novoSalario = Math.round(novoSalario * 100.0) / 100.0;

        return novoSalario;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] salarioPercentual = new double[3]; // Corrigido o tamanho do array para 3

        System.out.println("Digite o tempo de serviço:");
        salarioPercentual[0] = scanner.nextDouble();
        System.out.println("Digite o valor da inflação:");
        salarioPercentual[1] = scanner.nextDouble();
        System.out.println("Digite o salário do funcionário:");
        salarioPercentual[2] = scanner.nextDouble();

        double novoSalario = calculoSalario(salarioPercentual);
        System.out.println("Novo salário: " + novoSalario);
    }
}

