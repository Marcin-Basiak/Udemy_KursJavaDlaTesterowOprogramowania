// Klasa bazowa/nadrzedna, z ktorej inne klasy potomne/podrzedne (_46_PilkarzSuper, _47_NauczycielSuper) beda dziedziczyly pola i metody

public class _45_OsobaDziedziczenieSuper {

    public String imie;
    public int wiek;

    public _45_OsobaDziedziczenieSuper(String imie, int wiek){
        System.out.println("Wywolanie konstruktora z klasy bazowej/nadrzednej \"_45_OsobaDziedziczenieSuper\":");
        this.imie = imie;
        this.wiek = wiek;
    }

    public void jedz(){
        System.out.println("Lubie rosol.");
    }

    public void idz(){
        System.out.println("Lubie chodzic.");
    }
}