// Duza pierwsza litera w typie danych
public class _3_TypyObiektowe {

    public static void main(String[] args) {
        // Liczby staloprzecinkowe (bez przecinkow)
        Byte firstNumber = 127; // 1 bajt od -128 do 127
        Short secondNumber = 32689; // 2 bajty od -32768 do 32767
        Integer thirdNumber = 32768999; // 4 bajty od -2 147 483 648 do 2 147 483 647
        Long fourthNumber = 2148000L; // 8 bajtow od -2^63 do (2^63)-1;

        // Liczby zmiennoprzecinkowe (z przecinkami)
        Float fifthNumber = 4.99934F; // 4 bajty max. okolo 6-7 cyfr po przecinku
        Double sixthNumber = 3.999999999999999D; // 8 bajtow max. okolo 15 cyfr po przecinku

        // Wartosc logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        // Pojedynczy znak
        Character letter = 'A';

        // Ciag znakow
        String hello = "Hello Bro";

        // Wypisz pierwsza litere
        System.out.println(hello.charAt(0));
    }
}
