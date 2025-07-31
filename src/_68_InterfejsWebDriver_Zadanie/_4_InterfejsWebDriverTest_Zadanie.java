package _68_InterfejsWebDriver_Zadanie;

public class _4_InterfejsWebDriverTest_Zadanie {

    public static void main(String[] args) {
        _2_ImplementacjaInterfejsu_ChromeDriver chrome = new _2_ImplementacjaInterfejsu_ChromeDriver();
        chrome.get();
        chrome.findElementBy();
        System.out.println("\n");

        _3_ImplementacjaInterfejsu_Firefox firefox = new _3_ImplementacjaInterfejsu_Firefox();
        firefox.get();
        firefox.findElementBy();
    }
}