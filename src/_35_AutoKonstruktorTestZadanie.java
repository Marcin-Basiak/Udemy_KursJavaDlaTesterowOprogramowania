// Modyfikacja "_21_AutoTest" na wykorzystanie konstruktora

public class _35_AutoKonstruktorTestZadanie {

    public static void main(String[] args) {
        _34_AutoKonstruktorZadanie fiat = new _34_AutoKonstruktorZadanie("Fiat", "Punto", 2024, 10000);
        fiat.jedz();
        fiat.hamuj();
        fiat.informacje();

        _34_AutoKonstruktorZadanie audi = new _34_AutoKonstruktorZadanie("Audi", "A4", 2025, 5000);
        audi.jedz();
        audi.hamuj();
        audi.informacje();

        // Wykorzystanie konstruktora domyslnego, bez parametrow
        _34_AutoKonstruktorZadanie renault = new _34_AutoKonstruktorZadanie();
        renault.jedz();
        renault.hamuj();
        renault.informacje();
    }
}
