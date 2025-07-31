public class _54_PilkarzNadpisywanieMetod extends _53_OsobaNadpisywanieMetod{

    public String nazwaKlubu;

    _54_PilkarzNadpisywanieMetod(String imie, int wiek, String nazwaKlubu){
        super(imie, wiek);
        this.nazwaKlubu = nazwaKlubu;
        System.out.println("Wywolanie konstruktora z klasy potomnej/podrzednej \"_54_PilkarzNadpisywanieMetod\":");
    }

    // Uzycie slowa kluczowego "super" daje dostep do klasy bazowej/nadrzednej - dostep do pol i metod z klasy bazowej.
    public void jedz(){
        // Wywolanie metody "jedz" z klasy bazowej/nadrzednej.
        super.jedz();
        // I dodatkowo dodanie nowych komunikatów.
        System.out.println("> Nadpisanie metody (method overriding) \"jedz\" z klasy \"_53_OsobaNadpisywanieMetod\" metoda \"jedz\" z klasy \"_54_PilkarzNadpisywanieMetod\".");
        System.out.println("> Jestem pilkarzem dlatego lubie jesc banana i bulke.");
    }

    public void grajWPilke(){
        System.out.println("Lubie grac w pilke w zespole " + nazwaKlubu);
    }
}