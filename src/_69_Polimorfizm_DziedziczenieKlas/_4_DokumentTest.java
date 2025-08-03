package _69_Polimorfizm_DziedziczenieKlas;

public class _4_DokumentTest {

    public static void main(String[] args) {
        // Nasz konkretny typ - klasa potomna "_2_DokumentPdf" - jest typu klasy bazowej "_1_Dokument".
        // Klasa bazowa "_1_Dokument" moze wystepowac pod roznymi postaciami np. _2_DokumentPdf, _3_DokumentExcel.

        _1_Dokument dokumentPdf = new _2_DokumentPdf();
        _1_Dokument dokumentExcel = new _3_DokumentExcel();

        dokumentPdf.opisDokumentu();
        dokumentExcel.opisDokumentu();
    }
}