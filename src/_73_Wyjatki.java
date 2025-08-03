import _68_InterfejsWebDriver_Zadanie._1_InterfejsWebDriver_Zadanie;
import _68_InterfejsWebDriver_Zadanie._2_ImplementacjaInterfejsu_ChromeDriver;
import _68_InterfejsWebDriver_Zadanie._3_ImplementacjaInterfejsu_Firefox;

public class _73_Wyjatki {

    public static void main(String[] args) {
        // Przyklad numer 1: celowo podany bledny warunek w petli for (jest "<=", a powinno byc "<")
/*        int[] liczby = new int[2];
        liczby[0] = 1;
        liczby[1] = 3;

        for(int i = 0; i <= liczby.length; i++){
            System.out.println(liczby[i]);
        }
*/

        _1_InterfejsWebDriver_Zadanie driver = getDriver("test");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

    // Przyklad numer 2: podana wartosc spoza zakresu petli if/else if
    private static _1_InterfejsWebDriver_Zadanie getDriver(String name) {
        if(name.equals("chrome")){
            return new _2_ImplementacjaInterfejsu_ChromeDriver();
        } else if (name.equals("firefox")){
            return new _3_ImplementacjaInterfejsu_Firefox();
        }
        return null;
    }
}