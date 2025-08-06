package _68_InterfejsWebDriver_Zadanie;

public class _9_InterfejsWebDriverTest_Enum {

    public static void main(String[] args) {

        // Iterowanie po elementach Enuma (wyswietlenie wszystkich elementow z Enuma).
        _8_InterfejsWebDriver_Enum[] driverTypes = _8_InterfejsWebDriver_Enum.values();
        System.out.println("Wszystkie elementy Enuma:");
        for(int i = 0; i < driverTypes.length; i++){
            System.out.println("\t" + driverTypes[i]);
            System.out.println("\t" + driverTypes[i].nazwaPrzegladarki);
            System.out.println("\t" + driverTypes[i].sciezka);
            System.out.println("\n");
        }

        // Nie pobieramy juz wartosci ze zmiennej typu String lecz z Enuma "_8_InterfejsWebDriver_Enum".
        // Po kropce wskazujemy wartosc z Enuma: CHROME, FIREFOX.
        System.out.println("\n");
        _1_InterfejsWebDriver_Zadanie driver = getDriver(_8_InterfejsWebDriver_Enum.CHROME);
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

    // Nie pobieramy juz wartosci ze zmiennej typu String lecz z Enuma "_8_InterfejsWebDriver_Enum"
/*    private static _1_InterfejsWebDriver_Zadanie getDriver(_8_InterfejsWebDriver_Enum driverEnum) {
        if(driverEnum == _8_InterfejsWebDriver_Enum.CHROME){
            return new _2_ImplementacjaInterfejsu_ChromeDriver();
        }
        return new _3_ImplementacjaInterfejsu_Firefox();
    }
*/

    private static _1_InterfejsWebDriver_Zadanie getDriver(_8_InterfejsWebDriver_Enum driverEnum) {
        if(driverEnum.nazwaPrzegladarki.equals("chrome")){
            System.out.println("> Sciezka: " + driverEnum.sciezka);
            return new _2_ImplementacjaInterfejsu_ChromeDriver();
        }

        System.out.println("> Sciezka: " + driverEnum.sciezka);
        return new _3_ImplementacjaInterfejsu_Firefox();
    }
}