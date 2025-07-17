public class _48_OsobaDziedziczenieSuperTest {

    public static void main(String[] args) {

        _46_PilkarzSuper pilkarz = new _46_PilkarzSuper("Robert", 37, "FC Code");
        // Metody z klasy nadrzednej "_45_OsobaDziedziczenieSuper"
        pilkarz.jedz();
        pilkarz.idz();

        // Metoda z klasy potomnej "_46_PilkarzSuper"
        pilkarz.grajWPilke();
        System.out.println("\n");


        _47_NauczycielSuper nauczyciel = new _47_NauczycielSuper("Zbigniew", 50, "Wyzsza Szkola Psucia");
        // Metody z klasy nadrzednej "_45_OsobaDziedziczenieSuper"
        nauczyciel.jedz();
        nauczyciel.idz();

        // Metody z klasy potomnej "_47_NauczycielSuper"
        nauczyciel.ucz();
        nauczyciel.przedstawSie();
    }
}