public class _53_OsobaNadpisywanieMetod {

    public String imie;
    public int wiek;

    _53_OsobaNadpisywanieMetod(String imie, int wiek){
        System.out.println("Wywolanie konstruktora z klasy bazowej/nadrzednej \"_53_OsobaNadpisywanieMetod\":");
        this.imie = imie;
        this.wiek = wiek;
    }

    public void jedz(){
        System.out.println("Lubie rosol.");
    }

    public void idz(){
        System.out.println("Lubie chodzic w parku.");
    }
}