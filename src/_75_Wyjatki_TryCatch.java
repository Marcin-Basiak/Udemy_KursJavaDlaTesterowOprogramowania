import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _75_Wyjatki_TryCatch {

    // Wyjatek "checked", czyli taki, ktory jest wykrywany przez kompilator jeszcze przed uruchomieniem programu.

    // Drugim sposobem obslugi wyjatku jest "try" i "catch".
    // W bloku "try" podajemy kod, ktory chcemy wykonac.
    // W bloku "catch" podajemy kod, ktory wykona sie w przypadku wystapienia wyjatku,
    // czyli gdy nie uda sie wykonac operacji z bloku "try".
    // W "finally" umieszczamy kod, ktory zawsze sie wykona - bez wzgledu, czy wywolany zostanie kod z "try" lub "catch".
    public static void czytajPlik(String sciezkaDoPliku) throws FileNotFoundException {
        FileInputStream plik = new FileInputStream(sciezkaDoPliku);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Poczatek czytanego pliku (poczatek bloku \"try\").");
            czytajPlik("src/test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Nastapilo wywolanie wyjatku (wywolanie bloku \"catch\").");
            System.out.println("Wiadomosc wyjatku: " + e.getMessage());
            throw new RuntimeException(e);
        } finally {
            System.out.println("Koniec czytanego pliku (blok \"finally\").");
        }
    }
}