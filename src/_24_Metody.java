public class _24_Metody {

    // Metoda nie zwracajaca wartosci (void)
    public void policzWynik(){
        System.out.println("Zaraz policze wynik...");
        int result = 0;

        for (int i = 0; i < 100; i++){
            result = result + i;
        }
        System.out.println("Rezultat, to: " + result);
    }

    // Metoda zwracajaca wartosc typu int
    public int pobierzWynik(){
        System.out.println("Zaraz policze wynik...");
        int result = 0;

        for (int i = 0; i < 100; i++){
            result = result + i;
        }
        System.out.println("Rezultat, to: " + result);
        return result;
    }
}
