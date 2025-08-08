package _81_Kolekcja_Set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        // Set NIE MOZE zawierac duplikatow (Set moze przechowywac jedynie unikalne elementy).
        // Kolejnosc wprowadzania danych NIE MA znaczenia. Elementy nie posiadaja indexow.
        // Tym samym nie da sie pobierac elementow na podstawie indexow.

        // Nie trzeba podawac rozmiaru naszego zbioru (Set) jak to ma miejsce w przypadku tablic (Set automatycznie zmienia swoja wielkosc).
        // Dwie najczesciej wystepujace implementacje interfejsu Set to: HashSet i LinkedHashSet.
            // HashSet - XXX,
            // LinkedHashSet - XXX.

        Set<String> owoce = new HashSet<>();
            System.out.println("> Set \"HashSet\" owoce:");
            owoce.add("jablko");
            owoce.add("banan");
            owoce.add("kiwi");
            owoce.add("jablko");

            System.out.println("\tSprawdzenie, czy set zawiera wartosc \"jablko\": " + owoce.contains("jablko"));
            System.out.println("\tSprawdzenie, czy set zawiera wartosc \"Test\": " + owoce.contains("Test"));
            System.out.println("\n\tSet \"owoce\" ma wielkosc " + owoce.size() + " elementow (nie sa zliczane duplikaty).");
            System.out.println("\n\tCzy set jest pusty: " + owoce.isEmpty());

            // Iterowanie po wszystkich elementach seta.
            // Podajemy typ pojedynczego elementu >String<, nazwa dla pojedynczego elementu >owoc<, > : < , nazwa kolekcji >owoce<.
            // String owoc : owoce
            System.out.println("\n> Wszystkie elementy seta \"owoce\" (nie sa wypisywane duplikaty):");
            for(String owoc : owoce){
                System.out.println("\t" + owoc);
            }
            System.out.println("-------------------------------------------------------------------");

        Set<String> warzywa = new HashSet<>();
            System.out.println("\n> Set \"HashSet\" warzywa:");
            warzywa.add("ziemniak");
            warzywa.add("pomidor");
            warzywa.add("cukinia");
            warzywa.add("ziemniak");

            warzywa.addAll(owoce);
            System.out.println("\tSet \"warzywa\" ma wielkosc " + warzywa.size() + " elementow.");
    }
}