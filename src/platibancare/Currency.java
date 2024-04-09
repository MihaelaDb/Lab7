package platibancare;

public enum Currency {
    RON("ROMANIA", "RO"),
    USD("Statele Unite", "SUA"),
    EUR("Uniunea Europeana", "UE"),
    GBP("Marea Britanie", "UK"),
    TRY("Turcia", "TR");

    private final String country;

    private final String symbol;

    Currency(String country, String symbol){
        this.country=country;
        this.symbol=symbol;
    }

    public String getCountry(){
        return country;
    }
    public String getSymbol(){
        return symbol;
    }











}
