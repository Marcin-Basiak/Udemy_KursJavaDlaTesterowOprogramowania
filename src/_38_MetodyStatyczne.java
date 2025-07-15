// Metoda statyczna odnosi sie do klasy, a nie do obiektu danej klasy
// W metodzie statycznej moga byc wykorzystywane jedynie pola statyczne np. "nazwaUczelni"
// Odwolanie sie do pol nie-statycznych np. "imie" w metodzie statycznej nie zadziala
// W metodzie statycznej mozna korzystac z innej metody statycznej
// Modyfikacja "_36_PolaStatyczne" na wykorzystanie metody statycznej

public class _38_MetodyStatyczne {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "HGW";
    public static int rokStudiow = 2020;

    public void przedstawSie(){
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie(){
        System.out.println("Loguje sie przy pomocy nick: " + nick);
    }

    public void podajeEmail(){
        System.out.println("Moj adres email, to: " + email);
    }

    public void podajNumerIndeksu(){
        System.out.println("Moj numer indeksu, to: " + numerIndeksu);
        System.out.println("\n");
    }

    // Metoda statyczna numer 1
    public static void podajNazweUczelni(){
        // W metodzie statycznej moga byc wykorzystywane jedynie pola statyczne np. "nazwaUczelni"
        // Odwolanie sie do pol nie-statycznych np. "imie" w metodzie statycznej nie zadziala
        System.out.println("\tMoja uczelnia z metody statycznej \"podajNazweUczelni\", to: " + nazwaUczelni);
    }

    // Metoda statyczna numer 2
    public static void podajRokStudiow(){
        System.out.println("\tRok studiow z metody statycznej \"podajRokStudiow\", to: " + rokStudiow);

        // W metodzie statycznej mozna korzystac z innej metody statycznej
        podajNazweUczelni();
    }
}