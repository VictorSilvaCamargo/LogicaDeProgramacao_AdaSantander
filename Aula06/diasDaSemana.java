package Aula06;

// Enum DiaSemana
public enum diasDaSemana {
    DOMINGO("DOMINGO"),
    SEGUNDA("SEGUNDA"),
    TERCA("TERCA"),
    QUARTA("QUARTA"),
    QUINTA("QUINTA"),
    SEXTA("SEXTA"),
    SABADO("SABADO");

    private final String dia;

    diasDaSemana(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }

    public static diasDaSemana fromString(String dia) {
        for (diasDaSemana diaSemana : diasDaSemana.values()) {
            if (diaSemana.getDia().equalsIgnoreCase(dia)) {
                return diaSemana;
            }
        }
        return null;
    }
}

