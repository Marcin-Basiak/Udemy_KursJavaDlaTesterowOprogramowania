public class _27_MetodyParametryTest {

    public static void main(String[] args) {
        _26_MetodyParametry sumaLiczb = new _26_MetodyParametry();
        sumaLiczb.policzWynikParametr(100);
        sumaLiczb.policzWynikParametr(4);

        int result = sumaLiczb.sumaDwochLiczb(3, 5);
        System.out.println("Suma dwoch liczb, to: " + result);
    }
}