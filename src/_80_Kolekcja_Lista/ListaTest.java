package _80_Kolekcja_Lista;

import _69_Polimorfizm_DziedziczenieKlas._2_DokumentPdf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaTest {

    public static void main(String[] args) {
        // Kolekcja - to implementacja struktur danych (Lista, Set, Mapa).

        // Lista MOZE zawierac duplikaty.
        // Kolejnosc wprowadzania danych MA znaczenie. Kazdy element ma swoj unikalny index.
        // Numeracja indeksow jest od 0 tj. pierwszy element listy ma index=0, drugi element ma index=1 itd.
        // Nie trzeba podawac rozmiaru naszej listy (List) jak to ma miejsce w przypadku tablic (lista automatycznie zmienia swoja wielkosc).
        // Dwie najczesciej wystepujace implementacje interfejsu List to: ArrayList i LinkedList.
            // ArrayList - uzywamy, gdy czesciej wykonujemy odczytanie danych z listy,
            // LinkedList - uzywamy, gdy czesciej wykonujemy inne operacje np. usuwanie danych z listy.

        List<String> imiona = new ArrayList<>();
            System.out.println("> Lista \"ArrayList\" imiona:");
            imiona.add("Adam");
            imiona.add("Bartosz");
            imiona.add("Tomek");
            imiona.add("Adam");

            System.out.println("\tPierwszy element z listy (index = 0): " + imiona.get(0));
            System.out.println("\tDrugi element z listy (index = 1): " + imiona.get(1));
            System.out.println("\tTrzeci element z listy (index = 2): " + imiona.get(2));
            System.out.println("\tCzwarty element z listy (index = 3): " + imiona.get(3));

            // indexOf - wypisanie indexu dla PIERWSZEGO wystapienia danej wartosci.
            System.out.println("\n\tNumer indexu dla pierwszego wystapienia wartosci \"Adam\": " + imiona.indexOf("Adam"));
            System.out.println("\tNumer indexu dla pierwszego wystapienia wartosci \"Bartosz\": " + imiona.indexOf("Bartosz"));
            System.out.println("\tNumer indexu dla pierwszego wystapienia wartosci \"Tomek\": " + imiona.indexOf("Tomek"));

            // lastIndexOf - wypisanie indexu dla OSTATNIEGO wystapienia danej wartosci.
            System.out.println("\n\tNumer indexu dla ostatniego wystapienia wartosci \"Adam\": " + imiona.lastIndexOf("Adam"));

            // contains - sprawdzenie, czy nasza lista zawiera dana wartosc (true/false).
            System.out.println("\n\tSprawdzenie, czy lista zawiera wartosc \"Adam\": " + imiona.contains("Adam"));
            System.out.println("\tSprawdzenie, czy lista zawiera wartosc \"Test\": " + imiona.contains("Test"));

            // size - zwraca wielkosc listy.
            System.out.println("\n\tLista \"imiona\" ma wielkosc " + imiona.size() + " elementow.");

            // isEmpty - sprawdzenie, czy lista jest pusta (true - gdy lista JEST pusta, false - gdy lista NIE jest pusta)
            System.out.println("\n\tCzy lista jest pusta: " + imiona.isEmpty());
            System.out.println("-------------------------------------------------------------------");

        List<Integer> liczby = new LinkedList<>();
            System.out.println("\n> Lista \"LinkedList\" liczby:");
            liczby.add(1);
            liczby.add(27);
            liczby.add(41);
            liczby.add(1);

            System.out.println("\tPierwszy element z listy (index = 0): " + liczby.get(0));
            System.out.println("\tDrugi element z listy (index = 1): " + liczby.get(1));
            System.out.println("\tTrzeci element z listy (index = 2): " + liczby.get(2));
            System.out.println("\tCzwarty element z listy (index = 3): " + liczby.get(3));

            // indexOf - wypisanie indexu dla PIERWSZEGO wystapienia danej wartosci.
            System.out.println("\n\tNumer indexu dla pierwszego wystapienia wartosci \"1\": " + liczby.indexOf(1));
            System.out.println("\tNumer indexu dla pierwszego wystapienia wartosci \"27\": " + liczby.indexOf(27));
            System.out.println("\tNumer indexu dla pierwszego wystapienia wartosci \"41\": " + liczby.indexOf(41));

            // lastIndexOf - wypisanie indexu dla OSTATNIEGO wystapienia danej wartosci.
            System.out.println("\n\tNumer indexu dla ostatniego wystapienia wartosci \"1\": " + liczby.lastIndexOf(1));

            // contains - sprawdzenie, czy nasza lista zawiera dana wartosc (true/false).
            System.out.println("\n\tSprawdzenie, czy lista zawiera wartosc \"1\": " + liczby.contains(1));
            System.out.println("\tSprawdzenie, czy lista zawiera wartosc \"321\": " + liczby.contains("321"));

            // size - zwraca wielkosc listy.
            System.out.println("\n\tLista \"liczby\" ma wielkosc " + liczby.size() + " elementow.");

            // isEmpty - sprawdzenie, czy lista jest pusta (true - gdy lista JEST pusta, false - gdy lista NIE jest pusta)
            System.out.println("\n\tCzy lista jest pusta: " + liczby.isEmpty());
            System.out.println("-------------------------------------------------------------------");

        List<String> inneImiona = new ArrayList<>();
            System.out.println("\n> Lista \"ArrayList\" inneImiona:");
            // addAll - dodanie wszystkich wartosci z listy "imiona" do listy "inneImiona".
            inneImiona.addAll(imiona);

            // size - zwraca wielkosc listy.
            System.out.println("\n\tLista \"inneImiona\" ma wielkosc " + inneImiona.size() + " elementow.");
            System.out.println("-------------------------------------------------------------------");

        List<_2_DokumentPdf> dokumentPdf = new ArrayList<>();
            System.out.println("\n> Lista \"ArrayList\" dokumentPdf zawierajaca obiekty klasy \"_69_Polimorfizm_DziedziczenieKlas\\_2_DokumentPdf\":");
            dokumentPdf.add(new _2_DokumentPdf());
            System.out.println("-------------------------------------------------------------------");

        // Iterowanie po wszystkich elementach listy - sposob 1.
        System.out.println("\n> Wszystkie elementy listy \"imiona\" (sposob 1):");
        for(int i=0; i < imiona.size(); i++){
            System.out.println("\t" + imiona.get(i));
        }

        // Iterowanie po wszystkich elementach listy - sposob 2.
        // Podajemy typ pojedynczego elementu >String<, nazwa dla pojedynczego elementu >imie<, > : < , nazwa kolekcji >imiona<.
        // String imie : imiona
        System.out.println("\n> Wszystkie elementy listy \"imiona\" (sposob 2):");
        for(String imie : imiona){
            System.out.println("\t" + imie);
        }
    }
}