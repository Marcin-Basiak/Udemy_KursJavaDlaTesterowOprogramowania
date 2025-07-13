public class _28_MetodyProstyKalkulatorZadanie {

    public float addition(float firstNumber, float secondNumber){
        float results = firstNumber + secondNumber;
        System.out.println("Wynik z dodawania: " + results);
        System.out.println("\tWykonana operacja: " + firstNumber + " + " + secondNumber + " = " + results);
        return results;
    }

    public float substraction(float firstNumber, float secondNumber){
        float results = firstNumber - secondNumber;
        System.out.println("Wynik z odejmowania: " + results);
        System.out.println("\tWykonana operacja: " + firstNumber + " - " + secondNumber + " = " + results);
        return results;
    }

    public float multiplication(float firstNumber, float secondNumber){
        float results = firstNumber * secondNumber;
        System.out.println("Wynik z mnozenia: " + results);
        System.out.println("\tWykonana operacja: " + firstNumber + " * " + secondNumber + " = " + results);
        return results;
    }

    public float division(float firstNumber, float secondNumber){
        float results = firstNumber / secondNumber;
        System.out.println("Wynik z dzielenia: " + results);
        System.out.println("\tWykonana operacja: " + firstNumber + " / " + secondNumber + " = " + results);
        return results;
    }

    public float modulo(float firstNumber, float secondNumber){
        float results = firstNumber % secondNumber;
        System.out.println("Wynik z modulo: " + results);
        System.out.println("\tWykonana operacja: " + firstNumber + " % " + secondNumber + " = " + results);
        return results;
    }
}
