/**
 * Enumeração que representa um país 
 *
 */
public enum Pais {

	/* Valores possíveis da enumeração */
	
	// America
	BRASIL("BRA","America"), URUGUAI("URU","America"), ARGENTINA("ARG","America"),
	CHILE("CHI","America"), EQUADOR("ECU", "America"), COLOMBIA("COL", "America"),
	HONDURAS("HON","America"),COSTA_RICA("CRC","America"), MEXICO("MEX","America"),
	ESTADOS_UNIDOS("USA","America"),
	
	// África
	ARGELIA("ALG","Africa"), GANA("GHA","Africa"), NIGERIA("NGA","Africa"),
	CAMAROES("CMR","Africa"), COSTA_DO_MARFIM("CIV","Africa"),
	
	// Ásia
	IRA("IRN","Asia"), COREIA_DO_SUL("KOR","Asia"), JAPAO("JPN","Asia"), RUSSIA("RUS","Asia"),
	
	// Oceania
	AUSTRALIA("AUS","Oceania"),
	
	// Europa
	GRECIA("GRE","Europa"), BOSNIA_E_HERZEGOVINA("BIH","Europa"), CROACIA("CRO","Europa"),
	ITALIA("ITA","Europa"), SUICA("SUI","Europa"), ALEMANHA("GER","Europa"),
	HOLANDA("NED","Europa"), INGLATERRA("ENG","Europa"), BELGICA("BEL","Europa"),
	FRANCA("FRA","Europa"), ESPANHA("ESP","Europa"), PORTUGAL("POR","Europa");
	
	
	/** TODO Construtor */
	private Pais(String codigo, String continente) {

	}
	
	/** TODO Retornar código do país */
	public String getCodigo() {
	}
	
	/** TODO métodos que retornam true se país é de certo continente */
	
	public boolean africano() {}
	
	public boolean americano() {}
	
	public boolean asiatico() {}
	
	public boolean europeu() {}
	
	public boolean oceanico() {}
	
	/** TODO Obtem país pelo código.
	 *  Código da função abaixo não deve necessitar de alteração caso seja criado um novo país. */
	
	public static Pais getByCodigo(String codigo) {}
}
