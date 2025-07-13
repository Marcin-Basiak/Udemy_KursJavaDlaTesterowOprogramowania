public class _21_AutoTest {

    public static void main(String[] args) {
        _20_Auto fiat = new _20_Auto();
        fiat.marka = "Fiat";
        fiat.model = "Punto";
        fiat.rokProdukcji = 2024;
        fiat.przebieg = 10000;

        fiat.jedz();
        fiat.hamuj();
        fiat.informacje();

        _20_Auto audi = new _20_Auto();
        audi.marka = "Audi";
        audi.model = "A4";
        audi.rokProdukcji = 2025;
        audi.przebieg = 5000;

        audi.jedz();
        audi.hamuj();
        audi.informacje();

        _20_Auto renault = new _20_Auto();
        renault.jedz();
        renault.hamuj();
        renault.informacje();
    }
}
