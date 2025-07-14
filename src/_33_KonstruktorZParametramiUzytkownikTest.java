public class _33_KonstruktorZParametramiUzytkownikTest {

    public static void main(String[] args) {
        _32_KonstruktorZParametramiUzytkownik user = new _32_KonstruktorZParametramiUzytkownik("Zbyszek", "Kot");
        System.out.println("Moje imie, to: " + user.userName);
        System.out.println("Moje nazwisko, to: " + user.userLastName);
        user.sayHello();
    }
}
