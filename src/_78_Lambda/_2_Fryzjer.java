package _78_Lambda;

public class _2_Fryzjer implements _1_Pracownik {
    @Override
    public void przedstawSie(String imie, int wiek) {
        System.out.println("Jestem fryzjerem.");
        System.out.println("Moje imie to " + imie + " i mam " + wiek + " lat.");
        System.out.println("\n");
    }
}