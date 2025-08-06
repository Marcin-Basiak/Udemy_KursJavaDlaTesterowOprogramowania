package _68_InterfejsWebDriver_Zadanie;

public class _10_InterfejsWebDriverTest_KlasaAnonimowa {

    public static void main(String[] args) {
        _1_InterfejsWebDriver_Zadanie chrome_1 = new _2_ImplementacjaInterfejsu_ChromeDriver();
        _1_InterfejsWebDriver_Zadanie chrome_2 = new _2_ImplementacjaInterfejsu_ChromeDriver();

        _1_InterfejsWebDriver_Zadanie firefox_1 = new _3_ImplementacjaInterfejsu_Firefox();
        _1_InterfejsWebDriver_Zadanie firefox_2 = new _3_ImplementacjaInterfejsu_Firefox();
        _1_InterfejsWebDriver_Zadanie firefox_3 = new _3_ImplementacjaInterfejsu_Firefox();

        // Klasa anonimowa (anonymous) - klasa definiowana w kodzie, ktora ma tylko 1 obiekt.
        // Klasa nie posiada zadnej nazwy.
        // Nalezy recznie zaimplementowac metody z Interfejsu.
        _1_InterfejsWebDriver_Zadanie safari_1 = new _1_InterfejsWebDriver_Zadanie() {
            @Override
            public void get() {
                System.out.println("Otwieram przegladarke Safari.");
            }

            @Override
            public void findElementBy() {
                System.out.println("Znajduje element za pomoca przegladarki Safari.");
            }
        };

        safari_1.get();
        safari_1.findElementBy();
    }
}