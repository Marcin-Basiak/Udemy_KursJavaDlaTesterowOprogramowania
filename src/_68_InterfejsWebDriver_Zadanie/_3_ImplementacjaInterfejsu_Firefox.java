package _68_InterfejsWebDriver_Zadanie;

public class _3_ImplementacjaInterfejsu_Firefox implements _1_InterfejsWebDriver_Zadanie {
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke Firefox.");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element za pomoca przegladarki Firefox.");
    }
}