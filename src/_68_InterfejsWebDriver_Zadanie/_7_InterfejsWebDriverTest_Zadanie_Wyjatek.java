package _68_InterfejsWebDriver_Zadanie;

public class _7_InterfejsWebDriverTest_Zadanie_Wyjatek {

    public static void main(String[] args) {

        _1_InterfejsWebDriver_Zadanie driver = getDriver("test");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

    private static _1_InterfejsWebDriver_Zadanie getDriver(String name) {
        if(name.equals("chrome")){
            return new _2_ImplementacjaInterfejsu_ChromeDriver();
        } else if (name.equals("firefox")){
            return new _3_ImplementacjaInterfejsu_Firefox();
        }
        try {
            throw new _6_InterfejsWebDriver_Zadanie_Wyjatek("Zostala podana bledna nazwa przegladarki: " + name);
        } catch (_6_InterfejsWebDriver_Zadanie_Wyjatek e) {
            throw new RuntimeException(e);
        }
    }
}