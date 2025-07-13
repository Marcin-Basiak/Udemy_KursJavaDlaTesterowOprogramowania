import java.util.Scanner;

public class _29_MetodyProstyKalkulatorTestZadanie {

    public static void main(String[] args) {
        _28_MetodyProstyKalkulatorZadanie calculator = new _28_MetodyProstyKalkulatorZadanie();
        Scanner getNumbers = new Scanner(System.in);

        System.out.println("Prosze podaj pierwsza liczbe:");
        float firstNumber = getNumbers.nextFloat();
        System.out.println("Prosze podaj druga liczbe:");
        float secondNumber = getNumbers.nextInt();
        System.out.println("\n");

        calculator.addition(firstNumber, secondNumber);
        calculator.substraction(firstNumber, secondNumber);
        calculator.multiplication(firstNumber, secondNumber);
        calculator.division(firstNumber, secondNumber);
        calculator.modulo(firstNumber, secondNumber);
    }
}
