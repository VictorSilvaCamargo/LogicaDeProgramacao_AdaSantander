package Aula05;

public class QuantidadeNegativaException extends Exception {
    public QuantidadeNegativaException() {
        super("A quantidade de frutas não pode ser negativa.");
    }
}
