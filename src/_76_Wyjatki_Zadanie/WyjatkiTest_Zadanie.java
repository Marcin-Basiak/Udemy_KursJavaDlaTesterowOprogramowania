package _76_Wyjatki_Zadanie;

import java.util.Scanner;

public class WyjatkiTest_Zadanie {

    public static void main(String[] args) throws InvalidAgeExeption {
        Scanner pobierzWiek = new Scanner(System.in);
        System.out.println("Prosze podaj swoj wiek:");
        int wiek = pobierzWiek.nextInt();

        if(wiek < 0){
            throw new InvalidAgeExeption("Nie mozna wpisac mniejszego wieku niz 0 lat. Podales: " + wiek);
        } else if (wiek >= 18){
            System.out.println("> Jestes pelnoletni.");
        } else {
            System.out.println("> Nie jestes pelnoletni.");
        }
    }
}