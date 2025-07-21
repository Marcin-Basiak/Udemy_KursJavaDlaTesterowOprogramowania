public class _56_OsobaNadpisywanieMetodTest {

    public static void main(String[] args) {

        _54_PilkarzNadpisywanieMetod pilkarz = new _54_PilkarzNadpisywanieMetod("Robert", 37, "FC Code");
        pilkarz.jedz();
        pilkarz.idz();
        System.out.println("\n");

        _55_NauczycielNadpisywanieMetod nauczyciel = new _55_NauczycielNadpisywanieMetod("Zbigniew", 50, "Wyzsza Szkola Psucia");
        nauczyciel.jedz();
        nauczyciel.idz();
    }
}