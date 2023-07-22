package Aula04;

public class EX07 {
    public static void eUmTriangulo(int[] input)
    {
        if (input.length != 3)
        {
            System.out.println("O array deve conter exatamente três valores.");
            return;
        }

        int a = input[0];
        int b = input[1];
        int c = input[2];

        if (a >= b + c || b >= a + c || c >= a + b)
        {
            System.out.println("Os valores fornecidos não formam um triângulo válido.");
        }
        else
        {
            System.out.println("Os valores formam um triângulo válido.");
        }
    }

    public static void main(String[] args)
    {
        int[] valores = { 3, 9, 5 };

        eUmTriangulo(valores);
    }
}


