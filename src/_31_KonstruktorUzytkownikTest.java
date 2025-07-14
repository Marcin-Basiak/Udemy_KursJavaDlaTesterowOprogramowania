public class _31_KonstruktorUzytkownikTest {

    public static void main(String[] args) {
        _30_KonstruktorUzytkownik user = new _30_KonstruktorUzytkownik();
        user.userName = "Adam";
        user.userLastName = "Nowak";

        _30_KonstruktorUzytkownik userKonstruktorZParametrami = new _30_KonstruktorUzytkownik("Tomek","Kowal");

        user.sayHello();
    }
}
