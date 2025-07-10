import java.util.Scanner;

public class _15_Petla_For {
    public static void main(String[] args) {
        Scanner getStartRange = new Scanner(System.in);
        System.out.println("\nWypisz liczby od:");
        int startNumber = getStartRange.nextInt();

        Scanner getStopRange = new Scanner(System.in);
        System.out.println("\nWypisz liczby do:");
        int stopNumber = getStopRange.nextInt();

        Scanner getStepRange = new Scanner(System.in);
        System.out.println("\nSkok co ile liczb ma byc wykonane wypisanie:");
        int stepNumber = getStepRange.nextInt();

        Scanner getDivision = new Scanner(System.in);
        System.out.println("\nCzy wypisac liczby podzielne jedynie przez 5 (true/false?)");
        boolean questionDivision = getDivision.nextBoolean();

        if (questionDivision == true){
            System.out.println("\nWypisanie liczb od " + startNumber + " do " + stopNumber + " ale jedynie podzielnych przez 5:");
        } else {
            System.out.println("\nWypisanie liczb od " + startNumber + " do " + stopNumber + ":");
        }

        for (int i = startNumber; i <= stopNumber; i = i+stepNumber){
            if (questionDivision == false){
                System.out.println(i);
            } else if (questionDivision == true && i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}

