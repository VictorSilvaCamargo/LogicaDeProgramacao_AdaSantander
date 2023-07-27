package Aula07;

public class EX02 {

    public static int multiplicar(int limite){
        int multiplicacao = 1;

        for(int i = 1; i <= limite ; i++){
            multiplicacao *= i;
        }

        return multiplicacao;
    }

    public static int multiplicar2(int limite){
        if( limite == 1){
            return 1;
        }
        return limite * multiplicar2(limite -1);
    }



    public static void main(String[] args) {
        System.out.println(multiplicar(5));
        System.out.println(multiplicar2(5));
    }
}
