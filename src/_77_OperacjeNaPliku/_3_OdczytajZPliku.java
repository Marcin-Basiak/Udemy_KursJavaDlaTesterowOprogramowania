package _77_OperacjeNaPliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _3_OdczytajZPliku {

    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("src/_77_OperacjeNaPliku/NowyPlik.txt");
        Scanner odczytajPlik = new Scanner(plik);

        System.out.println("Zawartosc odczytanego pliku: " + plik);
        while (odczytajPlik.hasNext()){
            String wiersz = odczytajPlik.nextLine();
            System.out.println("\t"+wiersz);
        }
        System.out.println("\nPrzeczytano cala zawartosc pliku.");

        odczytajPlik.close();
        System.out.println("Zamknieto plik.");
    }
}