package _68_InterfejsWebDriver_Zadanie;

public enum _8_InterfejsWebDriver_Enum {

    // Przyjelo sie podawac enumy drukowanymi literami.
    CHROME("chrome", "Chrome.exe"),
    FIREFOX("firefox", "Firefox.exe");

    String nazwaPrzegladarki;
    String sciezka;

    // Konstruktor
    _8_InterfejsWebDriver_Enum(String nazwaPrzegladarki, String sciezka){
        this.nazwaPrzegladarki = nazwaPrzegladarki;
        this.sciezka = sciezka;
    }
}