package _61_IdentyfikatoryDostepu.package1;

public class _3_OtherWithoutExtends {

    // Klasa potomna/podrzedna NIE MA dostepu do pol klasy/metod "private" z klasy bazowej/nadrzednej (bez znaczenia, czy to ta sama, czy inna paczka)

    public void testMethodOtherWithoutExtendsPackage1(){
        _1_Parent parent = new _1_Parent();
        System.out.println(parent.first_Public);
        System.out.println(parent.second_Default);
        System.out.println(parent.third_Protected);
        // System.out.println(parent.fourth_Private);   // brak dostepu do pola klasy "private" z innej klasy

        parent.firstMethod_Public();
        parent.secondMethod_Default();
        parent.thirdMethod_Protected();
        // parent.fourthMethod_Private();               // brak dostepu do metody "private" z innej klasy
    }
}