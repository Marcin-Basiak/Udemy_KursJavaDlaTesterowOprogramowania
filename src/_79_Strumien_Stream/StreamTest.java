package _79_Strumien_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamTest {

    public static void main(String[] args) {

    // 1. Tworzenie strumienia. Strumien mozna utworzyc z tablicy, kolekcji (listy), mozna tez recznie podac.
        // Stream z listy
        List<String> imiona = Arrays.asList("Adam", "Tomek", "Zbigniew", "Kasia");
        Stream<String> strumienImion = imiona.stream();

        List<String> zawody = Arrays.asList("malarz", "krawiec", "kosmetyczka", "komik", "nauczyciel");
        Stream<String> strumienZawodow = zawody.stream();

        // Stream z tablicy
        Stream<Integer> strumienLiczb = Arrays.asList(new Integer[] {1, 5, 23, 58}).stream();

        // Stream z liczb double
        DoubleStream strumienDouble = DoubleStream.of(3, 5.99, 14.62, 45.67, 59.95);

        // Stream z liczb int
        IntStream strumienInt = IntStream.of(1, 8, 12, 34, 52, 77, 98);
        IntStream strumienZakresInt = IntStream.range(1, 100);

    // 2. Przetwarzanie strumienia.
        // filter - filtrowanie, podanie warunku (za pomoca wyrazenia lambda), ktory ma spelnic element w strumieniu,
        // map - zmiana elementu na inna wartosc,
        // limit - zwraca okreslona liczbe elementow,
        // peek - pozwala wykonac operacje na kazdym elemencie.

        // Filtrowanie imion, ktore zaczynaja sie (startsWith) na litere "T", a nastepnie zmiana liter na drukowane.
        System.out.println("Elementy, ktore zaczynaja sie na litere \"T\":");
        strumienImion.filter(element -> element.startsWith("T"))
                     .map(element -> element.toUpperCase())
                     .forEach(element -> System.out.println(element));


        // Filtrowanie elementow, ktore sa wieksze od 10, nastepnie pomnozenie spelaniajacych elementow x2
        // i na koniec zwrocenie jedynie pierwszych 3 elementow spelniajacych warunki.
        System.out.println("\nElementy, ktore sa wieksze od 10:");
        strumienInt.filter(element -> element>10)
                   .map(element -> element * 2)
                   .limit(3)
                   .forEach(element -> System.out.println(element));

        long zliczElementy = strumienZakresInt.filter(element -> element > 90)
                                              .count();

        System.out.println("\nLiczba elementow wiekszych od 90: " + zliczElementy);

        System.out.println("\nElementy, ktore zaczynaja sie na litere \"K\":");
        List<String> zmienionyStrumienZawodow = strumienZawodow.filter(element -> element.startsWith("k"))
                .map(element -> element.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\tPierwszy element na litere \"K\": " + zmienionyStrumienZawodow.get(0));
        System.out.println("\tDrugi element na litere \"K\": " + zmienionyStrumienZawodow.get(1));
        System.out.println("\tTrzeci element na litere \"K\": " + zmienionyStrumienZawodow.get(2));
        System.out.println("Suma wszystkich elementow na litere \"K\": " + zmienionyStrumienZawodow.size());


    // 3. Zakonczenie strumienia.
        // forEach - wykonanie akcji dla kazdego elementu strumienia,
        // count - zwraca liczbe elementow w strumieniu,
        // allMatch - sprawdzenie, czy wszystkie elementy z naszego strumienia sprawdzaja jakis warunek,
            // wartosc "false", gdy przynajmniej 1 element strumienia nie spelnia warunku,
            // wartosc "true", gdy wszystkie elementy strumienia spelniaja warunek,
        // collect - zwraca nowa liste strumienia np. po wczesniejszym wykonaniu filtrowania lub narzuceniu limitu.
    }
}