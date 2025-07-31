public class _62_Getter {

    private String name = "Adam";

    // Getter - pobieranie wartosci z pol prywatnych.

    // Aby inne klasy byly w stanie odczytac wartosc pola prywatnego (private),
    // to mozna stworzyc metode publiczna (public), ktora zwroci nam wartosc tego pola.
    // Metoda, ktora zwraca wartosc pola prywatnego (private), to getter.
    // Przyjelo sie, aby nazwa metody zaczynala sie od "get" a nastepnie byla podana nazwe pola, ktore pobieramy - w naszym przykladzie "getName".

    // Korzystajac z gettera - w tym przypadku - wartosc naszego pola jest tylko do odczytu (read only).
    // Wszyscy moga odczytac wartosc pola ale nikt nie moze zmienic jego wartosci.

    public String getName(){
        return name;
    }
}