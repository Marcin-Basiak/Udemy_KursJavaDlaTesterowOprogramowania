public class _55_NauczycielNadpisywanieMetod extends _53_OsobaNadpisywanieMetod {

    public String nazwaSzkoly;

    _55_NauczycielNadpisywanieMetod(String imie, int wiek, String nazwaSzkoly) {
        super(imie, wiek);
        this.nazwaSzkoly = nazwaSzkoly;
        System.out.println("Wywolanie konstruktora z klasy potomnej/podrzednej \"_55_NauczycielNadpisywanieMetod\":");
    }

    public void idz(){
        System.out.println("> Nadpisanie metody (method overriding) \"idz\" z klasy \"_53_OsobaNadpisywanieMetod\" metoda \"idz\" z klasy \"_55_NauczycielNadpisywanieMetod\".");
        System.out.println("> Jestem nauczycielem dlatego zamiast lubic chodzic w parku, to lubie chodzic w klasie.");
    }

    public void ucz(){
        System.out.println("Lubie uczyc w szkole " + nazwaSzkoly);
    }

    public void przedstawSie(){
        System.out.println("Czesc, nazywam sie " + imie + " i mam " + wiek + " lat");
    }
}