package _77_OperacjeNaPliku;

import java.io.File;

public class _4_UsunPlik {

    public static void main(String[] args) {
        File plik = new File("src/_77_OperacjeNaPliku/NowyPlik.txt");


        if(plik.delete()) {
            System.out.println("Usunieto plik: " + plik);
        } else {
            System.out.println("Nie udalo sie usunac pliku.\n> Brak pliku w: " + plik);
        }
    }
}