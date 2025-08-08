package _83_Interview;

import java.util.HashMap;
import java.util.Map;

public class _1_ZliczWystapienia {

    // ZADANIE:
    // Zlicz wystapienia podanych cyfr np. 1 wystepuje 1x, 2 wystepuje 2x, 3 wystepuje 2x, 5 wystepuje 1x.
    // int[] liczby = new int[] {1, 2, 3, 2, 5, 3};

    public static void main(String[] args) {
        zliczWystapienia(new int[] {1, 2, 3, 2, 5, 3});
    }

    public static void zliczWystapienia(int[] liczby){
        Map<Integer, Integer> wystapienia = new HashMap<>();
        for(int i=0; i < liczby.length; i++){
            if(wystapienia.containsKey(liczby[i])){
                Integer wartoscDlaKlucza = wystapienia.get(liczby[i]);
                wystapienia.put(liczby[i], wartoscDlaKlucza+1);
            } else{
                wystapienia.put(liczby[i], 1);
            }
        }

        for(Integer klucz : wystapienia.keySet()){
            System.out.println("\tLiczba " + klucz + " wystepuje " + wystapienia.get(klucz) + "x");
        }

        System.out.println("Liczba elementow w mapie: " + wystapienia.size());
    }
}