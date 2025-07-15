// Modyfikacja "_37_PolaStatyczneTest" na wykorzystanie metody statycznej

public class _39_MetodyStatyczneTest {

    public static void main(String[] args) {
        // Pole statyczne charakterystyczne dla klasy, nie jest powiazane z zadnym obiektem, wartosc jest taka sama dla kazdego obieku klasy
        // Dostep do pola statycznego jest bez potrzeby tworzenia obieku klasy
        System.out.println("Wywolanie metody statycznej \"podajNazweUczelni\":");
        _38_MetodyStatyczne.podajNazweUczelni();
        System.out.println("Wywolanie metody statycznej \"podajRokStudiow\":");
        _38_MetodyStatyczne.podajRokStudiow();

        _38_MetodyStatyczne adam = new _38_MetodyStatyczne();
        adam.imie = "Adam";
        adam.nazwisko = "Nowak";
        adam.nick = "aNowak";
        adam.email = "adamNowak@test.com";
        adam.numerIndeksu = 1;

        System.out.println("\nWywolanie metody statycznej \"podajNazweUczelni\" dla obiektu \"adam\":");
        adam.podajNazweUczelni();

        System.out.println("\nWywolanie metody statycznej \"podajRokStudiow\" zawierajacej w sobie wywolanie innej metody statycznej \"podajNazweUczelni\" dla obiektu \"adam\":");
        adam.podajRokStudiow();

    }
}
