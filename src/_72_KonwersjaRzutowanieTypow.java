import _68_InterfejsWebDriver_Zadanie._1_InterfejsWebDriver_Zadanie;
import _68_InterfejsWebDriver_Zadanie._2_ImplementacjaInterfejsu_ChromeDriver;

public class _72_KonwersjaRzutowanieTypow {

    public static void main(String[] args) {
        int a = 10;
        double b = 4.56;

        double c = a / b;           // Nastepuje niejawna konwersja i wartosc zmiennej "a" zostaje przekonwertowana na typ double "2.00".

        // Java nie moze wykonac konwersji wartosci zmiennej "b", bo wtedy stracilibysmy czesc po przecinku ".56"
        // int d = a / b;

        // Konwersja/rzutowanie typu double na int.
        // Przed zmienna, ktora chcemy przekonwertowac nalezy wstawic nawias i podac w nim nowy typ danych dla zmiennej.
        int d = a / (int) b;

        System.out.println("Wynik dla c (niejawna konwersja int na double): " + c);
        System.out.println("Wynik dla d (wymuszona konwersja double na int): " + d);
        System.out.println("\n");

        _1_InterfejsWebDriver_Zadanie driver = new _2_ImplementacjaInterfejsu_ChromeDriver();
        _2_ImplementacjaInterfejsu_ChromeDriver chromeDriver = (_2_ImplementacjaInterfejsu_ChromeDriver) driver;
        chromeDriver.get();
    }
}