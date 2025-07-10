// Operatory porownania porownuja elementy rownania i zwracaja wartosc logiczna czyli true lub false

import java.util.Scanner;

public class _9_OperatoryPorownania {
    public static void main(String[] args) {
        System.out.println("> Operacje porownania");
        Scanner getNumbers = new Scanner(System.in);
        System.out.println("Prosze podaj pierwsza liczbe:");
        int firstNumber = getNumbers.nextInt();
        System.out.println("Prosze podaj druga liczbe:");
        int secondNumber = getNumbers.nextInt();

        System.out.println("Czy " + firstNumber + " > " + secondNumber + "?\n\t" + (firstNumber > secondNumber));

        System.out.println("\nCzy " + firstNumber + " < " + secondNumber + "?\n\t" + (firstNumber < secondNumber));

        System.out.println("\nCzy " + firstNumber + " >= " + secondNumber + "?\n\t" + (firstNumber >= secondNumber));

        System.out.println("\nCzy " + firstNumber + " <= " + secondNumber + "?\n\t" + (firstNumber <= secondNumber));

        System.out.println("\nCzy " + firstNumber + " = " + secondNumber + "?\n\t" + (firstNumber == secondNumber));

        System.out.println("\nCzy " + firstNumber + " != " + secondNumber + "?\n\t" + (firstNumber != secondNumber));
    }
}
