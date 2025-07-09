// Pobieranie danych, ktore uzytkownik musi wpisac
import java.util.Scanner;

public class _7_PobierzDaneOdUzytkownika {
    public static void main(String[] args) {
        Scanner getName = new Scanner(System.in);
        System.out.println("> Wypisywanie podanego imienia");
        System.out.println("Prosze podaj swoje imie:");
        String name = getName.nextLine();
        System.out.println("Czesc " + name + "!");

        Scanner getNumber = new Scanner(System.in);
        System.out.println("\n> Obliczanie kwadratu z podanej liczby");
        System.out.println("Prosze podaj liczbe:");
        int firstNumber = getNumber.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat podanej przez Ciebie liczby \"" + firstNumber + "\" to: " + result);
    }
}
