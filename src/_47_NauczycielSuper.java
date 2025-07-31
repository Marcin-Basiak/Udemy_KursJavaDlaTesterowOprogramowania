public class _47_NauczycielSuper extends _45_OsobaDziedziczenieSuper {

    public String nazwaSzkoly;

    // Konstruktor zawierajacy slowo kluczowe "super", ktore powoduje wywolanie konstruktora z klasy nadrzednej "_45_OsobaDziedziczenieSuper".
    // Slowo kluczowe "super" czyli wywolanie konstruktora z klasy bazowej/nadrzednej musi znalezc się na pierwszym miejscu w konstruktorze z klasy potomnej/podrzednej.
    // Uzycie slowa kluczowego "super" daje dostep do klasy bazowej/nadrzednej - dostep do pol i metod z klasy bazowej.

    public _47_NauczycielSuper(String imie, int wiek, String nazwaSzkoly){
        super(imie, wiek);
        this.nazwaSzkoly = nazwaSzkoly;
        System.out.println("Wywolanie konstruktora z klasy potomnej/podrzednej \"_47_NauczycielSuper\":");
    }

    public void ucz(){
        System.out.println("Lubie uczyc w szkole " + nazwaSzkoly);
    }

    public void przedstawSie(){
        System.out.println("Czesc, nazywam sie " + imie + " i mam " + wiek + " lat");
    }
}