import java.util.Scanner;

public class _17_Petla_Do_While {
    public static void main(String[] args) {
        Scanner getStartRange = new Scanner(System.in);
        System.out.println("\nWypisz liczby od:");
        int startNumber = getStartRange.nextInt();

        Scanner getStopRange = new Scanner(System.in);
        System.out.println("\nWypisz liczby do:");
        int stopNumber = getStopRange.nextInt();
        System.out.println("\n");

        do {
            System.out.println(startNumber);
            startNumber++;
        }
        while (startNumber <= stopNumber);
    }
}
