import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _74_Wyjatki_Throws {

    // Wyjatek "checked", czyli taki, ktory jest wykrywany przez kompilator jeszcze przed uruchomieniem programu.

    // Pierwszym sposobem obslugi wyjatku jest dodanie do nazwy metody "throws FileNotFoundException"
    // czyli jawne wskazanie, ze metoda moze zwrocic wyjatek.
    // Jesli w metodzie "czytajPlik" wykorzystamy obsluge "throws", to wtedy w innych metodach korzystajacych z tej metody
    // rowniez trzeba dodac obsluge wyjatku "throws".
    public static void czytajPlik(String sciezkaDoPliku) throws FileNotFoundException {
        FileInputStream plik = new FileInputStream(sciezkaDoPliku);
    }

    public static void main(String[] args) throws FileNotFoundException {
        czytajPlik("src/test.txt");
    }
}