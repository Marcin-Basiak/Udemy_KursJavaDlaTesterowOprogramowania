public class _46_PilkarzSuper extends _45_OsobaDziedziczenieSuper {

    public String nazwaKlubu;

    // Konstruktor zawierajacy slowo kluczowe "super", ktore powoduje wywolanie konstruktora z klasy nadrzednej "_45_OsobaDziedziczenieSuper".
    // Slowo kluczowe "super" czyli wywolanie konstruktora z klasy bazowej/nadrzednej musi znalezc się na pierwszym miejscu w konstruktorze z klasy potomnej/podrzednej.
    // Uzycie slowa kluczowego "super" daje dostep do klasy bazowej/nadrzednej - dostep do pol i metod z klasy bazowej.

    public _46_PilkarzSuper(String imie, int wiek, String nazwaKlubu) {
        super(imie, wiek);
        this.nazwaKlubu = nazwaKlubu;
        System.out.println("Wywolanie konstruktora z klasy potomnej/podrzednej \"_46_PilkarzSuper\":");
    }

    public void grajWPilke(){
        System.out.println("Lubie grac w pilke w zespole " + nazwaKlubu);
    }
}