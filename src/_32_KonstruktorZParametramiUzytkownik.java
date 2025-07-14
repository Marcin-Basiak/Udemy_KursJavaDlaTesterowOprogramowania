public class _32_KonstruktorZParametramiUzytkownik {

    public String userName;
    public String userLastName;

    // Jesli argument z konstruktora ma taka sama nazwe co pole klasy, wowczas w definicji konstuktora nalezy uzyc "this"
    public _32_KonstruktorZParametramiUzytkownik(String userName, String userLastName){
        this.userName = userName;
        this.userLastName = userLastName;
    }

    public void sayHello(){
        System.out.println("Witaj " + userName + " " + userLastName + "!");
        System.out.println("\n");
    }
}
