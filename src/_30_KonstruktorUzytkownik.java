public class _30_KonstruktorUzytkownik {

    public String userName;
    public String userLastName;

    // Konstruktor domyslny, bez przekazanych parametrow, nie trzeba go jawnie definiowac
    public _30_KonstruktorUzytkownik(){
        System.out.println("Hello z konstruktora domyslnego.");
        System.out.println("\n");
    }

    // Konstruktor z parametrami (userName, userLastName)
    public _30_KonstruktorUzytkownik(String userName, String userLastName){
        System.out.println("Hello z konstruktora z parametrami.");
        System.out.println("Nazywam sie " + userName + " " + userLastName);
        System.out.println("\n");
    }

    public void sayHello(){
        System.out.println("Hello z metody \"sayHello\".");
        System.out.println("Witaj " + userName + " " + userLastName + "!");
        System.out.println("\n");
    }
}
