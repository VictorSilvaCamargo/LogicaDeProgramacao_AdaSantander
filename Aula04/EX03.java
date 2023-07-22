package Aula04;

public class EX03 {
    public static String mediaAproveitamento(double[] input)
    {

        if (input == null || input.length != 4) {
            throw new IllegalArgumentException("O array de entrada deve conter 4 elementos: N1, N2, N3 e média dos exercícios.");
        }

        // Obtendo as notas e a média dos exercícios
        double n1 = input[0];
        double n2 = input[1];
        double n3 = input[2];
        double mediaExercicios = input[3];

        // Calculando a média de aproveitamento
        double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 7;

        // Determinando o conceito com base na média de aproveitamento
        if (mediaAproveitamento >= 9.0) {
            return "A";
        } else if (mediaAproveitamento >= 7.5) {
            return "B";
        } else if (mediaAproveitamento >= 6.0) {
            return "C";
        } else {
            return "D";
        }


    }
    public static void main(String[] args) {
        double[] notasAluno1 = {8.0, 7.0, 8.0, 8.0};
        double[] notasAluno2 = {5.0, 4.3, 8.0, 7.0};

        System.out.println(mediaAproveitamento(notasAluno1));
        System.out.println(mediaAproveitamento(notasAluno2));
    }

}

