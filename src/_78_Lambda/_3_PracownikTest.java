package _78_Lambda;

public class _3_PracownikTest {

    public static void przedstawSie(String imie, int wiek, _1_Pracownik pracownik){
        pracownik.przedstawSie(imie, wiek);
    }

    public static void main(String[] args) {
        _1_Pracownik fryzjer = new _2_Fryzjer();
        przedstawSie("Adam",25, fryzjer);

        // Klasa anonimowa
        _1_Pracownik lekarz = new _1_Pracownik() {
            @Override
            public void przedstawSie(String imie, int wiek) {
                System.out.println("> Klasa anonimowa:");
                System.out.println("Jestem lekarzem.");
                System.out.println("Moje imie to " + imie + " i mam " + wiek + " lat.");
                System.out.println("\n");
            }
        };
        przedstawSie("Tomek",40, lekarz);

        // Wyrazenie Lambda
        // (Parametry) -> To co ma sie wykonac
        // (imie) -> System.out.println("Jestem stolarzem.");
        System.out.println("> Wyrazenie Lambda:");
        _1_Pracownik uczen = (imie, wiek) -> System.out.println("Nie jestem pracownikiem tylko uczniem.\nMoje imie to " + imie + " i mam " + wiek + " lat.");
        przedstawSie("Zbigniew", 16, uczen);


        _1_Pracownik przedszkolak = (imie, wiek) -> {
            System.out.println("\n> Wielowierszowe wyrazenie Lambda (nalezy pamietac o {}).");
            System.out.println("Nie jestem pracownikiem tylko przedszkolakiem.\nMoje imie to " + imie + " i mam " + wiek + " lat.");
            if(wiek < 6){
                System.out.println("Jestem przedszkolakiem, bo mam mniej niz 6 lat.");
            }
        };
        przedstawSie("Kacperek", 5, przedszkolak);
    }
}