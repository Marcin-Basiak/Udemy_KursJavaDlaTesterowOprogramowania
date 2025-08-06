package _77_OperacjeNaPliku;

import java.io.File;
import java.io.IOException;

public class _1_UtworzPlik {

    public static void main(String[] args) throws IOException {
        // Sciezka do pliku, ktory chcemy stworzyc/otworzyc
        File plik = new File("src/_77_OperacjeNaPliku/NowyPlik.txt");

        if(plik.createNewFile()){
            System.out.println("Utworzylem nowy plik w: " + plik);    // jesli pliku nie ma, to go tworzymy
        } else {
            System.out.println("Plik juz istnieje w: " + plik);       // jesli jest plik, to wypisujemy stosowny komunikat
        }
    }
}