public class _26_MetodyParametry {

    // Metoda z parametrami nie zwracajaca wartosci (void)
    public void policzWynikParametr(int number){
        int result = 0;

        for (int i = 0; i < number; i++){
            result = result + i;
        }
        System.out.println("Rezultat dla liczby " + number + ", to: " + result);
    }

    public int sumaDwochLiczb(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println("Suma dwoch liczb \"" + firstNumber + "\" oraz \"" + secondNumber + "\" to: " + result);
        return result;
    }
}
