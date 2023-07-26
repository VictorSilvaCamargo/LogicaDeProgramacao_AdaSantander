package Aula06;

// Enum DiaSemana
public enum DiasDaSemana {
    DOMINGO("Domingo"),
    SEGUNDA("Segunda-Feira"),
    TERCA("Terça-Feira"),
    QUARTA("Quarta-Feira"),
    QUINTA("Quinta-Feira"),
    SEXTA("Sexta-Feira"),
    SABADO("Sábado");

    private final String dia;

    DiasDaSemana(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }

    public static DiasDaSemana fromString(String dia) throws DiaDaSemanaInvalidoExeption {
        for (DiasDaSemana diaSemana : DiasDaSemana.values()) {
            if (diaSemana.getDia().equalsIgnoreCase(dia)) {
                return diaSemana;
            }
        }
        throw new DiaDaSemanaInvalidoExeption();
    }
}

