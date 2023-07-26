package Aula07;


public enum DiasDaSemana {
    DOMINGO(new String[]{"Domingo","Dom"},1),
    SEGUNDA(new String[]{"Segunda-Feira","segunda","Seg"},2),
    TERCA(new String[]{"Terça-Feira","Terca-Feira","terça","terca","Ter"},3),
    QUARTA(new String[]{"Quarta-Feira","Quarta","Qua"},4),
    QUINTA(new String[]{"Quinta-Feira","Quinta","Qui"},5),
    SEXTA(new String[]{"Sexta-Feira","Sexta","Sex"},6),
    SABADO(new String[]{"Sábado","Sabado","Sáb","Sab"},7);

    private final String[] keywords;


    DiasDaSemana(String[] keywords , int dia) {

        this.keywords = keywords;
    }

    public String[] getKeywords() {

        return keywords;
    }



    public static DiasDaSemana fromString(String dia) throws DiaDaSemanaInvalidoExeption {
        for (DiasDaSemana diaSemana : DiasDaSemana.values()) {
            for(String keyword : diaSemana.getKeywords()) {
                if (keyword.equalsIgnoreCase(dia)) {
                    return diaSemana;
                }
            }
        }
        throw new DiaDaSemanaInvalidoExeption();
    }
}
