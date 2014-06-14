/**
 * Enumeração que representa um país
 */
public enum Pais {

	/* Valores possíveis da enumeração */

    // America
    BRASIL("BRA", "America"), URUGUAI("URU", "America"), ARGENTINA("ARG", "America"),
    CHILE("CHI", "America"), EQUADOR("ECU", "America"), COLOMBIA("COL", "America"),
    HONDURAS("HON", "America"), COSTA_RICA("CRC", "America"), MEXICO("MEX", "America"),
    ESTADOS_UNIDOS("USA", "America"),

    // África
    ARGELIA("ALG", "Africa"), GANA("GHA", "Africa"), NIGERIA("NGA", "Africa"),
    CAMAROES("CMR", "Africa"), COSTA_DO_MARFIM("CIV", "Africa"),

    // Ásia
    IRA("IRN", "Asia"), COREIA_DO_SUL("KOR", "Asia"), JAPAO("JPN", "Asia"), RUSSIA("RUS", "Asia"),

    // Oceania
    AUSTRALIA("AUS", "Oceania"),

    // Europa
    GRECIA("GRE", "Europa"), BOSNIA_E_HERZEGOVINA("BIH", "Europa"), CROACIA("CRO", "Europa"),
    ITALIA("ITA", "Europa"), SUICA("SUI", "Europa"), ALEMANHA("GER", "Europa"),
    HOLANDA("NED", "Europa"), INGLATERRA("ENG", "Europa"), BELGICA("BEL", "Europa"),
    FRANCA("FRA", "Europa"), ESPANHA("ESP", "Europa"), PORTUGAL("POR", "Europa");

    private final String codigo;
    private final String continente;

    private Pais(String codigo, String continente) {
        this.codigo = codigo;
        this.continente = continente;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public boolean africano() {
        return this.continente == "Africa";
    }

    public boolean americano() {
        return this.continente == "America";
    }

    public boolean asiatico() {
        return this.continente == "Asia";
    }

    public boolean europeu() {
        return this.continente == "Europa";
    }

    public boolean oceanico() {
        return this.continente == "Oceania";
    }

    public static Pais getByCodigo(String codigo) {
        for (Pais e : Pais.values()) {
            if (codigo.equals(e.getCodigo())) {
                return e;
            }
        }
        return null;
    }
}
