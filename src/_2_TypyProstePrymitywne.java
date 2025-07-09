// Mala pierwsza litera w typie danych
public class _2_TypyProstePrymitywne {

    public static void main(String[] args) {
        // Liczby staloprzecinkowe (bez przecinkow)
        byte firstNumber = 127; // 1 bajt od -128 do 127
        short secondNumber = 32689; // 2 bajty od -32768 do 32767
        int thirtNumber = 32768999; // 4 bajty od -2 147 483 648 do 2 147 483 647
        long fourthNumber = 2148000L; // 8 bajtow od -2^63 do (2^63)-1

        // Liczby zmiennoprzecinkowe (z przecinkami)
        float fifthNumber = 4.99934F; // 4 bajty max. okolo 6-7 cyfr po przecinku
        double sixthNumber = 3.999999999999999D; // 8 bajtow max. okolo 15 cyfr po przecinku

        // Wartosc logiczna
        boolean prawda = true;
        boolean falsz = false;

        // Pojedynczy znak
        char letter = 'A';
    }
}
