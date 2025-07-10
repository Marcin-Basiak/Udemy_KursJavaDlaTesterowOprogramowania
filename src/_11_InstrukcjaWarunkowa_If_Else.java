import java.util.Scanner;

public class _11_InstrukcjaWarunkowa_If_Else {
    public static void main(String[] args) {
        Scanner getNumbers = new Scanner(System.in);

        System.out.println("Prosze podaj pierwsza liczbe (dzielna):");
        float dzielna = getNumbers.nextInt();
        System.out.println("Prosze podaj druga liczbe (dzielnik):");
        float dzielnik = getNumbers.nextInt();

        // Dzielnik nie moze byc zerem (bo wtedy w wyniku otrzymujemy nieskonczonosc), a wiec trzeba się przed tym zabezpieczyc
        if(dzielnik != 0){
            System.out.println("\nWynik z dzielenia " + dzielna + " / " + dzielnik + " to:\n\t" + dzielna / dzielnik);
        } else {
            System.out.println("\nDzielnik nie moze byc zerem, prosze podaj inna liczbe niz ZERO.");
        }

    }
}
