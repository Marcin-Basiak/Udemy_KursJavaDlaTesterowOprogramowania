package _68_InterfejsWebDriver_Zadanie;

public class _2_ImplementacjaInterfejsu_ChromeDriver implements _1_InterfejsWebDriver_Zadanie {
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke Chrome.");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element za pomoca przegladarki Chrome.");
    }
}