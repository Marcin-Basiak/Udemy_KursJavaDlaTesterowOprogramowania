import java.util.Scanner;

public class _12_InstrukcjaWarunkowa_Else_If {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);

        System.out.println("Prosze podaj liczbe z przedzialu od 1 do 100:");
        int number = getNumber.nextInt();

        if(number < 1){
            System.out.println("\nPodana liczba " + number + " jest mniejsza niz liczba 1.\nProsze podaj inna liczbe.");
        } else if (number > 100){
            System.out.println("\nPodana liczba " + number + " jest wieksza niz liczba 100.\nProsze podaj inna liczbe.");
        } else {
            System.out.println("\nPodana liczba " + number + " jest prawidlowa liczba z przedzialu od 1 do 100.");
        }
    }
}
