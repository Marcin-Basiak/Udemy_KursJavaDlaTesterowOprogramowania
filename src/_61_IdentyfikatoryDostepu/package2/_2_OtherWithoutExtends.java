package _61_IdentyfikatoryDostepu.package2;

import _61_IdentyfikatoryDostepu.package1._1_Parent;

public class _2_OtherWithoutExtends {

    // Klasa potomna/podrzedna NIE MA dostepu do pol klasy/metod "private" z klasy bazowej/nadrzednej (bez znaczenia, czy to ta sama, czy inna paczka)
    // Klasa potomna/podrzedna z INNEJ paczki NIE MA dostepu do pol klasy/metod "default" z klasy bazowej/nadrzednej
    // Z uwagi na brak dziedziczenia (extends) brak dostepu do pol klasy/metod "protected"

    public void testMethodOtherWithoutExtendsPackage2(){
        _1_Parent parent = new _1_Parent();
        System.out.println(parent.first_Public);
        // System.out.println(parent.second_Default);   // brak dostepu do pola klasy "default" z klasy z innej paczki
        // System.out.println(parent.third_Protected);  // brak dostepu do pola klasy "protected" z uwagi na brak dziedziczenia "extends"
        // System.out.println(parent.fourth_Private);   // brak dostepu do pola klasy "private" z innej klasy

        parent.firstMethod_Public();
        // parent.secondMethod_Default();               // brak dostepu do metody "default" z klasy z innej paczki
        // parent.thirdMethod_Protected();              //brak dostepu do metody "protected" z uwagi na brak dziedziczenia "extends"
        // parent.fourthMethod_Private();               // brak dostepu do metody "private" z innej klasy
    }
}