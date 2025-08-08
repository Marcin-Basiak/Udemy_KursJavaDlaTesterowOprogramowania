package _83_Interview;

public class _3_CiagFibonacciego {

    // ZADANIE:
    // Wypisz na ekranie wartosc dla X wyrazu z ciagu Fibonacciego.
    // Jak dziala ciag Finobacciego?
    // Pierwszy wyraz ciagu Fibonacciego = 1, drugi tez 1, a trzeci i kazdy nastepny jest suma dwoch wczesniejszych liczb.
    // 1 = 1
    // 2 = 1
    // 3 = 2 (bo 1 + 1)
    // 4 = 3 (bo 2 + 1)
    // 5 = 5 (bo 3 + 2)
    // 6 = 8 (bo 5 + 3)
    // 7 = 13 (bo 8 + 5)

    public static void main(String[] args) {
        fibonacci(1);
        fibonacci(2);
        fibonacci(6);
        fibonacci(7);
    }

    public static void fibonacci(int wartoscDlaCiagu){
        long wartoscDlaCiagu_1 = 1;
        long wartoscDlaCiagu_2 = 1;

        for(int i=3; i <= wartoscDlaCiagu; i++){
            long sumaDwochPoprzednichLiczb = wartoscDlaCiagu_2 + wartoscDlaCiagu_1;
            wartoscDlaCiagu_1 = wartoscDlaCiagu_2;
            wartoscDlaCiagu_2 = sumaDwochPoprzednichLiczb;
        }
        System.out.println("Wartosc ciagu Fibonacciego dla " + wartoscDlaCiagu + " to: " + wartoscDlaCiagu_2);
    }
}