package _82_Kolekcja_Mapa;

import java.util.HashMap;
import java.util.Map;

public class MapaTest {

    public static void main(String[] args) {
        // Mapa przechowuje pary "klucz-wartosc".
        // Klucze MUSZA byc unikalne, ale wartosci NIE musza byc unikalne.
        // Jesli dodamy dwa elementy z takim samym kluczem, to wowczas drugie wystapienie nadpisze to pierwsze.
        // Np. "2, Adam", "2, Kasia" wowczas podczas wypisania wartosci dla klucza 2 zostanie wypisana wartosc "Kasia".
        // Najczesciej wystepujaca implementacja interfejsu Map to: HashMap.

        Map<Integer, String> studenci = new HashMap<>();
            System.out.println("> Mapa \"HashMap\" studenci:");
            studenci.put(1, "Adam");
            studenci.put(2, "Bartosz");
            studenci.put(3, "Tomek");
            studenci.put(4, "Adam");

            System.out.println("\tPierwszy element z mapy (klucz = 1): " + studenci.get(1));
            System.out.println("\tDrugi element z mapy (klucz = 2): " + studenci.get(2));
            System.out.println("\tTrzeci element z mapy (klucz = 3): " + studenci.get(3));
            System.out.println("\tCzwarty element z mapy (klucz = 4): " + studenci.get(4));

            // containsKey - sprawdzenie, czy mapa zawiera klucz (true/false).
            System.out.println("\n\tSprawdzenie, czy mapa zawiera klucz \"1\": " + studenci.containsKey(1));

            // containsValue - sprawdzenie, czy mapa zawiera dana wartosc (true/false).
            System.out.println("\tSprawdzenie, czy mapa zawiera wartosc \"Adam\": " + studenci.containsValue("Adam"));

            System.out.println("\n\tCzy mapa jest pusta: " + studenci.isEmpty());
            System.out.println("\n\tMapa \"studenci\" ma wielkosc " + studenci.size() + " elementow.");

            // remove - usuniecie klucza o wskazanym kluczu.
            studenci.remove(1);
            System.out.println("\n\tMapa \"studenci\" po usunieciu klucza=1 ma wielkosc " + studenci.size() + " elementow.");

            // Iterowanie po wszystkich elementach mapy.
            // Podajemy typ klucza >Integer<, nazwa dla pojedynczego elementu >student<, > : < , nazwa kolekcji >studenci<.
            // Integer student : studenci
            System.out.println("\n> Wszystkie klucze mapy \"studenci\":");
            for(Integer student : studenci.keySet()){
                System.out.println("\t" + student);
            }

            System.out.println("\n> Wszystkie wartosci mapy \"studenci\" (sposob 1 - keySet):");
            for(Integer student : studenci.keySet()){
                System.out.println("\t" + studenci.get(student));
            }

            System.out.println("\n> Wszystkie wartosci mapy \"studenci\" (sposob 2 - values):");
            for(String student : studenci.values()){
                System.out.println("\t" + student);
            }

            System.out.println("-------------------------------------------------------------------");

        Map<Integer, String> inniStudenci = new HashMap<>();
            System.out.println("\n> Mapa \"HashMap\" inniStudenci:");
            inniStudenci.putAll(studenci);
            System.out.println("\tMapa \"inniStudenci\" ma wielkosc " + studenci.size() + " elementow.");
    }
}