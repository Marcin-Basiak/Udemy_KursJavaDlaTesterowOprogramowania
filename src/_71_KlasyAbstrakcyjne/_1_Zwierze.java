package _71_KlasyAbstrakcyjne;

// Klase abstrakcyjna tworzymy przez dodanie "abstract"
public abstract class _1_Zwierze {

    // Stala zmienna "final", ktorej nie bedzie mozna zmienic
    public final static int liczbaNog = 4;



    // Metode abstrakcyjna tworzymy przez dodanie "abstract". Metoda abstrakcyjna nie moze zawierac implementacji metody.
    public abstract void dzwiek();

    // Zwykla metoda z implementacja.
    public void przedstawSie(){
        System.out.println("Jestem zwierzeciem.");
    }
}