package Aula06;

enum Estado {
    MG(7),
    RJ(15),
    SP(12);

    private final double taxaImposto;

    Estado(double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public double getTaxaImposto() {
        return taxaImposto;
    }
}







