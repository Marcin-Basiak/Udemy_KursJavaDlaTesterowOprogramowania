public class _44_OsobaDziedziczenieTest {

    public static void main(String[] args) {

        _42_Pilkarz pilkarz = new _42_Pilkarz();
        pilkarz.imie = "Robert";
        pilkarz.wiek = 37;
        pilkarz.nazwaKlubu = "FC Code";

        // Metody z klasy nadrzednej "_41_OsobaDziedziczenie"
        pilkarz.jedz();
        pilkarz.idz();

        // Metoda z klasy potomnej "_42_Pilkarz"
        pilkarz.grajWPilke();
        System.out.println("\n");


        _43_Nauczyciel nauczyciel = new _43_Nauczyciel();
        nauczyciel.imie = "Zbigniew";
        nauczyciel.wiek = 50;
        nauczyciel.nazwaSzkoly = "Wyzsza Szkola Psucia";

        // Metody z klasy nadrzednej "_41_OsobaDziedziczenie"
        nauczyciel.jedz();
        nauczyciel.idz();

        // Metody z klasy potomnej "_43_Nauczyciel"
        nauczyciel.ucz();
        nauczyciel.przedstawSie();
    }
}