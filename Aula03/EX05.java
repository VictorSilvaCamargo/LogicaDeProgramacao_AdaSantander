package Aula03;

public class EX05
{
    public static boolean elementosRepetidos(double[] input)
    {

        for (int i = 0; i < input.length - 1; i++)
        {
            for (int j = i + 1; j < input.length; j++)
            {

                if (input[i] == input[j])
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        double[] arr1 = {2.5, 3.2, 4.5, 5, 6};
        double[] arr2 = {2, 2, 3.1, 4, 4.1, 4.1};

        System.out.println(elementosRepetidos(arr1));
        System.out.println(elementosRepetidos(arr2));
    }
}

