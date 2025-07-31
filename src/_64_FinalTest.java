public class _64_FinalTest {

    public static void main(String[] args) {

        // Final - brak mozliwosci zmiany/nadpisania wartosci przypisanej do zmiennej.
        // Dodatkowo brak mozliwosci nadpisywania metod i brak mozliwosci dziedziczenia klas (extends).

        // Dla typow prostych np. int, nie mozemy przypisac do zmiennej "liczba" innej wartosci.
        final int liczba = 3;
        // liczba = 5;                                                  // to nie zadziala, bo zmienna jest typu final


        // Nowy obiekt klasy "_45_OsobaDziedziczenieSuper", parametry konstruktora to "imie" i "wiek".
        // Dla typow obiektowych jest mozliwosc zmiany dla juz istniejacego obiektu.
        // Ale nie mozna przypisac nowej osoby, stworzyc nowego obiektu tego typu do juz istniejacej zmiennej "final".
        final _45_OsobaDziedziczenieSuper osoba = new _45_OsobaDziedziczenieSuper("Adam", 25);
        osoba.wiek = 30;

        // osoba = new _45_OsobaDziedziczenieSuper("Tomek", 40);        // to nie zadziala, bo obiekt jest typu final
    }
}