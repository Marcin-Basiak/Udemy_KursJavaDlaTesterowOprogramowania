public class _25_MetodyTest {

    public static void main(String[] args) {
        _24_Metody sumaLiczba = new _24_Metody();
        sumaLiczba.policzWynik();

        int result = sumaLiczba.pobierzWynik();
        int result2 = result * 2;
        System.out.println("Rezultat przed mnozeniem x2, to: " + result);
        System.out.println("Rezultat po mnozeniu x2, to: " + result2);
    }
}
