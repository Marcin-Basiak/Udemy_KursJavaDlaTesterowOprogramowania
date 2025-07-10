import java.util.Scanner;

public class _13_WeryfikacjaWiekuZadanie {
    public static void main(String[] args) {
        Scanner getAge = new Scanner(System.in);

        System.out.println("Prosze podaj swoj wiek:");
        int age = getAge.nextInt();

        if(age >= 18){
            System.out.println("\nMasz " + age + " lat, a wiec jestes pelnoletni i mozesz kupic %.");
        } else if(age <= 0){
            System.out.println("\nNie mozesz podac wieku mniejszego niz 1.");
        } else{
            System.out.println("\nHola hola, masz " + age + " lat, a wiec malolatom nie sprzedajemy %.");
        }
    }
}