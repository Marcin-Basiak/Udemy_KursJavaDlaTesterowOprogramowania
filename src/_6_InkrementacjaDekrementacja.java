public class _6_InkrementacjaDekrementacja {
    public static void main(String[] args) {
        // Inkrementacja, zwiekszenie wartosci o 1
        int firstNumberI = 0;
        System.out.println("Inkrementacja:");
        System.out.println("Wartosc zmiennej \"firstNumberI\": " + firstNumberI);

        // Post inkrementacja, najpierw przypisujemy wartosc, a dopiero pozniej dodajemy 1
        // Czyli na poczatku "firstNumberI = 0"
        // Pozniej wykonujemy post inkrementacje, a wiec najpierw przypisuejmy, ze "secondNumberI = firstNumberI"
        // Dopiero pozniej wykonujemy dodawanie "secondNumberI = firstNumberI + 1"
        int secondNumberI = firstNumberI++;
        System.out.println("Wartosc zmiennej \"secondNumberI\" po post inkrementacji: " + secondNumberI);
        System.out.println("Wartosc zmiennej \"firstNumberI\" po post inkrementacji: " + firstNumberI);

        // Pre inkrementacja, najpierw dodajemy, a dopiero pozniej przypisujemy
        // Czyli na poczatku "firstNumberI = 0"
        // Pozniej wykonujemy pre inkrementacje, a wiec wykonujemy dodawanie "secondNumberI = firstNumberI + 1"
        // Dopiero pozniej przypisuejmy, ze "secondNumberI = firstNumberI"
        int thirtNumberI = ++firstNumberI;
        System.out.println("Wartosc zmiennej \"thirtNumberI\" po pre inkrementacji: " + thirtNumberI);
        System.out.println("Wartosc zmiennej \"firstNumberI\" po pre inkrementacji: " + firstNumberI);



        // Dekrementacja, zmniejszenie wartosci o 1
        int firstNumberD = 0;
        System.out.println("\nDekrementacja:");
        System.out.println("Wartosc zmiennej \"firstNumberD\": " + firstNumberD);

        // Post dekrementacja, najpierw przypisujemy wartosc, a dopiero pozniej odejmujemy 1
        // Czyli na poczatku "firstNumberD = 0"
        // Pozniej wykonujemy post dekrementacje, a wiec najpierw przypisuejmy, ze "secondNumberD = firstNumberD"
        // Dopiero pozniej wykonujemy odejmowanie "secondNumberD = firstNumberD - 1"
        int secondNumberD = firstNumberD--;
        System.out.println("Wartosc zmiennej \"secondNumberD\" po post dekrementacji: " + secondNumberD);
        System.out.println("Wartosc zmiennej \"firstNumberD\" po post dekrementacji: " + firstNumberD);

        // Pre dekrementacja, najpierw odejmujemy, a dopiero pozniej przypisujemy
        // Czyli na poczatku "firstNumber = 0"
        // Pozniej wykonujemy pre dekrementacje, a wiec wykonujemy odejmowanie "secondNumberD = firstNumberD - 1"
        // Dopiero pozniej przypisuejmy, ze "secondNumberD = firstNumberD"
        int thirtNumberD = --firstNumberD;
        System.out.println("Wartosc zmiennej \"thirtNumberD\" po pre dekrementacji: " + thirtNumberD);
        System.out.println("Wartosc zmiennej \"firstNumberD\" po pre dekrementacji: " + firstNumberD);
    }
}
