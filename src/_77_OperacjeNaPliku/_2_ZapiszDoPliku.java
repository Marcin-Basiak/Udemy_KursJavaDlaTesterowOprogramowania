package _77_OperacjeNaPliku;

import java.io.FileWriter;
import java.io.IOException;

public class _2_ZapiszDoPliku {

    public static void main(String[] args) throws IOException {
        // Sciezka do pliku, ktory chcemy odczytac
        FileWriter plik = new FileWriter("src/_77_OperacjeNaPliku/NowyPlik.txt");
        plik.write("Przykładowy tekst.\nNowy wiersz A.\nNowy wiersz B.");
        System.out.println("Dodano tekst do pliku.");
        plik.close();
        System.out.println("Zamknieto plik.");
    }
}