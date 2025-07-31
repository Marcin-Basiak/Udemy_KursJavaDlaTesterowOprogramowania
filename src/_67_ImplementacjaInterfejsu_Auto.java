public class _67_ImplementacjaInterfejsu_Auto implements _65_Interfejs_Pojazdy {

    // Klasa "_67_ImplementacjaInterfejsu_Auto" implementuje (implements) interfejs "_65_Interfejs_Pojazdy".
    // W zwiazku z tym klasa "_67_ImplementacjaInterfejsu_Auto" musi posiadac implementacje dla WSZYSTKICH metod z interfejsu "_65_Interfejs_Pojazdy".
    // Jednak klasa "_67_ImplementacjaInterfejsu_Auto" moze dodatkowo posiadac jakies swoje metody.

    @Override
    public void jedz(int predkosc) {
        System.out.println("Jade autem z predkoscia " + predkosc);
    }

    @Override
    public void zatrzymajSie() {
        System.out.println("Zatrzymuje auto.");
    }

    @Override
    public String info() {
        return "Auto";
    }
}