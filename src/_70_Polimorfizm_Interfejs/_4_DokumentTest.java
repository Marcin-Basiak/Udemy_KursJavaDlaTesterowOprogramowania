package _70_Polimorfizm_Interfejs;

public class _4_DokumentTest {

    public static void main(String[] args) {
        // Nasz konkretny typ - klasa potomna "_2_DokumentPdf" - jest typu klasy bazowej "_1_Dokument".
        // Klasa bazowa "_1_Dokument" moze wystepowac pod roznymi postaciami np. _2_DokumentPdf, _3_DokumentExcel.

        _1_Dokument dokument = new _2_DokumentPdf();
        _2_DokumentPdf dokumentPdf = new _2_DokumentPdf();
        _3_DokumentExcel dokumentExcel = new _3_DokumentExcel();

        dokument.opisDokumentu();
        dokumentPdf.opisDokumentu();
        dokumentExcel.opisDokumentu();
    }
}