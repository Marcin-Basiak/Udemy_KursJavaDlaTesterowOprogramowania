public class _52_AplikacjaZadanieTest {

    public static void main(String[] args) {
        _50_AplikacjaAndroidZadanie android = new _50_AplikacjaAndroidZadanie("Android Message", "1.29");
        android.uruchomAplikacjeAndroid();
        android.informacjeOAplikacji();
        System.out.println("\n");

        _51_AplikacjaIOsZadanie iOs = new _51_AplikacjaIOsZadanie("iOS eMail", "25.07.17.001");
        iOs.uruchomAplikacjeIOs();
        iOs.informacjeOAplikacji();
    }
}