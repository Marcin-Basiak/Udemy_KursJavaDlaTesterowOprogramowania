import java.util.Scanner;

public class _14_Switch {
    public static void main(String[] args) {
        Scanner getName = new Scanner(System.in);

        System.out.println("Prosze podaj nazwe jednego z dostepnych skladnikow (ser, szynka, pomidor):");
        String nameFood = getName.nextLine();

        switch (nameFood){
            case "ser":
                System.out.println("\nWybrano " + nameFood + ", ktory kosztuje 10 zl.");
                break;
            case "szynka":
                System.out.println("\nWybrano " + nameFood + ", ktora kosztuje 20 zl.");
                break;
            case "pomidor":
                System.out.println("\nWybrano " + nameFood + ", ktory kosztuje 5 zl.");
                break;
            default:
                System.out.println("\nPodany skladnik \"" + nameFood + "\" nie jest dostepny.");
        }
    }
}
