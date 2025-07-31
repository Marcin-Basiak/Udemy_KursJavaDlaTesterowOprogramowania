public class _63_Setter {

    private String name = "Jan";

    // Setter - ustawianie wartosci dla pol prywatnych.

    // Metoda "setName" przyjmuje parametr "name", ktory bedzie przypisywany do pola prywatnego "name"
    // Pole prywatne "name" moze byc konfigurowane z zewnatrz przez inne klasy.
    // Dostep do pola jest ograniczony, poniewaz na tym polu nie umozliwiamy zadnego dzialania (ustawiamy jedynie wartosc, bez mozliwosci odczytu).

    public void setName(String name){
        this.name = name;
    }
}