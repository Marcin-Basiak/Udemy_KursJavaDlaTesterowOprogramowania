package _61_IdentyfikatoryDostepu.package1;

public class _2_Child extends _1_Parent {

    // Klasa potomna/podrzedna NIE MA dostepu do pol klasy/metod "private" z klasy bazowej/nadrzednej (bez znaczenia, czy to ta sama, czy inna paczka)

    public void testMethodChildPackage1(){
        System.out.println(first_Public);
        System.out.println(second_Default);
        System.out.println(third_Protected);
        // System.out.println(fourthPrivate);           // brak dostepu do pola klasy "private" z innej klasy

        firstMethod_Public();
        secondMethod_Default();
        thirdMethod_Protected();
        // fourthMethodPrivate();                       // brak dostepu do metody "private" z innej klasy
    }
}