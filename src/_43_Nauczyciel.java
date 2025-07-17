// Klasa potomna/podrzedna "_43_Nauczyciel" rozszerza (extends) klase bazowa/nadrzedna "_41_OsobaDziedziczenie"
// Czyli klasa "_43_Nauczyciel" ma dostep do pol i metod z klasy "_41_OsobaDziedziczenie"

public class _43_Nauczyciel extends _41_OsobaDziedziczenie {

    public String nazwaSzkoly;

    public void ucz(){
        System.out.println("Lubie uczyc w szkole " + nazwaSzkoly);
    }

    public void przedstawSie(){
        System.out.println("Czesc, nazywam sie " + imie + " i mam " + wiek + " lat");
    }
}