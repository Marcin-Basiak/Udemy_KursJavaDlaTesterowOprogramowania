package _68_InterfejsWebDriver_Zadanie;

public class _5_InterfejsWebDriverTest_Zadanie_Polimorfizm {

    public static void main(String[] args) {

        _1_InterfejsWebDriver_Zadanie driver = getDriver("chrome");
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
        return null;
    }
}