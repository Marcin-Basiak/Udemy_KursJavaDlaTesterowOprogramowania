// Pola statyczne odnosza sie do klasy, a nie do obiektu danej klasy
// Modyfikacja "_22_Student" na wykorzystanie pola statycznego "nazwaUczelni"

public class _36_PolaStatyczne {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "HGW";

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
}
