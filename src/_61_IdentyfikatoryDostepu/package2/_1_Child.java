package _61_IdentyfikatoryDostepu.package2;

import _61_IdentyfikatoryDostepu.package1._1_Parent;

public class _1_Child extends _1_Parent {

    // Klasa potomna/podrzedna NIE MA dostepu do pol klasy/metod "private" z klasy bazowej/nadrzednej (bez znaczenia, czy to ta sama, czy inna paczka)
    // Klasa potomna/podrzedna z INNEJ paczki NIE MA dostepu do pol klasy/metod "default" z klasy bazowej/nadrzednej

    public void testMethodChildPackage2(){
        // Odwolanie do pol
        System.out.println(first_Public);
        // System.out.println(secondDefault);           // brak dostepu do pola klasy "default" z klasy z innej paczki
        System.out.println(third_Protected);
        // System.out.println(fourthPrivate);           // brak dostepu do pola klasy "private" z innej klasy

        // Odwolanie do metod
        firstMethod_Public();
        // secondMethod_Default();                      // brak dostepu do metody "default" z klasy z innej paczki
        thirdMethod_Protected();
        // fourthMethod_Private();                      // brak dostepu do metody "private" z innej klasy
    }
}