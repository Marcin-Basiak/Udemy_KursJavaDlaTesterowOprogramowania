// Modyfikacja "_23_StudentTestZadanie" na wykorzystanie pola statycznego "nazwaUczelni"

public class _37_PolaStatyczneTest {

    public static void main(String[] args) {
        // Pole statyczne charakterystyczne dla klasy, nie jest powiazane z zadnym obiektem, wartosc jest taka sama dla kazdego obieku klasy
        // Dostep do pola statycznego jest bez potrzeby tworzenia obieku klasy
        String uczelnia = _36_PolaStatyczne.nazwaUczelni;
        System.out.println("> Nazwa pola statycznego \"nazwaUczelni\": " + uczelnia);

        _36_PolaStatyczne adam = new _36_PolaStatyczne();
        adam.imie = "Adam";
        adam.nazwisko = "Nowak";
        adam.nick = "aNowak";
        adam.email = "adamNowak@test.com";
        adam.numerIndeksu = 1;
        String uczelniaAdama = adam.nazwaUczelni;
        System.out.println("> Nazwa pola statycznego \"nazwaUczelni\" dla obiektu \"adam\": " + uczelniaAdama);
    }
}
