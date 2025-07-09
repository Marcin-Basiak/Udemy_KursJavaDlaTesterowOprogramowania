// Pobieramy od uzytkownika 2 liczby, a nastepnie na tych podanych liczbach wykonujemy operacje matemetyczne

import java.util.Scanner;

public class _8_HomeWorkCalculator {
    public static void main(String[] args) {
        Scanner getNumbers = new Scanner(System.in);
        System.out.println("> Podstawowe operacje matematyczne na 2 podanych przez uzytkownika liczbach");

        System.out.println("Prosze podaj pierwsza liczbe:");
        float firstNumber = getNumbers.nextInt();
        System.out.println("Prosze podaj druga liczbe:");
        float secondNumber = getNumbers.nextInt();

        System.out.println("\n");
        float addition = firstNumber + secondNumber;
        System.out.println("Wynik z dodawania: " + addition);
        System.out.println("\tWykonana operacja: " + firstNumber + " + " + secondNumber + " = " + addition);

        float substraction = firstNumber - secondNumber;
        System.out.println("Wynik z odejmowania: " + substraction);
        System.out.println("\tWykonana operacja: " + firstNumber + " - " + secondNumber + " = " + substraction);

        float multiplication = firstNumber * secondNumber;
        System.out.println("Wynik z mnozenia: " + multiplication);
        System.out.println("\tWykonana operacja: " + firstNumber + " * " + secondNumber + " = " + multiplication);

        float division = firstNumber / secondNumber;
        System.out.println("Wynik z dzielenia: " + division);
        System.out.println("\tWykonana operacja: " + firstNumber + " / " + secondNumber + " = " + division);

        float modulo = firstNumber % secondNumber;
        System.out.println("Wynik z modulo: " + modulo);
        System.out.println("\tWykonana operacja: " + firstNumber + " % " + secondNumber + " = " + modulo);
    }
}
