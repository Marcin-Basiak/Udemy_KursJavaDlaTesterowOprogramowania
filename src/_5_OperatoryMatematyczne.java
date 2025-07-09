// Operatory matematyczne umozliwiaja wykonywanie operacji matematycznych
public class _5_OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4;                              // Na potrzeby dzielenia, aby byly miejsca po przecinku

        int addition = firstNumber + secondNumber;          // Dodawanie
        int substraction = firstNumber - secondNumber;      // Odejmowanie
        int multiplication = firstNumber * secondNumber;    // Mnozenie
        float division = thirdNumber / secondNumber;        // Dzielenie
        int modulo = secondNumber % firstNumber;            // Modulo, reszta z dzielenia

        System.out.println("Pierwsze wyniki:");
        System.out.println("Wynik z dodawania: " + addition);
        System.out.println("Wynik z odejmowania: " + substraction);
        System.out.println("Wynik z mnozenia: " + multiplication);
        System.out.println("Wynik z dzielenia: " + division);
        System.out.println("Wynik z modulo: " + modulo);

        System.out.println("\nDrugie wyniki:");
        firstNumber+=secondNumber;                          // firstNumber = firstNumber + secondNumber
        System.out.println("Wynik z dodawania: " + firstNumber);
        firstNumber-=secondNumber;                          // firstNumber = firstNumber - secondNumber
        System.out.println("Wynik z odejmowania: " + firstNumber);
        firstNumber*=secondNumber;                          // firstNumber = firstNumber * secondNumber
        System.out.println("Wynik z mnozenia: " + firstNumber);
        firstNumber/=secondNumber;                          // firstNumber = firstNumber / secondNumber
        System.out.println("Wynik z dzielenia: " + firstNumber);
        firstNumber%=secondNumber;                          // firstNumber = firstNumber % secondNumber
        System.out.println("Wynik z modulo: " + firstNumber);
    }
}
