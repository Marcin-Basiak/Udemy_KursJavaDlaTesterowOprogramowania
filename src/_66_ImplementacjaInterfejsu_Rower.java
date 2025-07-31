public class _66_ImplementacjaInterfejsu_Rower implements _65_Interfejs_Pojazdy {

    // Klasa "_66_ImplementacjaInterfejsu_Rower" implementuje (implements) interfejs "_65_Interfejs_Pojazdy".
    // W zwiazku z tym klasa "_66_ImplementacjaInterfejsu_Rower" musi posiadac implementacje dla WSZYSTKICH metod z interfejsu "_65_Interfejs_Pojazdy".
    // Jednak klasa "_66_ImplementacjaInterfejsu_Rower" moze dodatkowo posiadac jakies swoje metody.

    @Override
    public void jedz(int predkosc) {
        System.out.println("Jade rowerem z predkoscia " + predkosc);
    }

    @Override
    public void zatrzymajSie() {
        System.out.println("Zatrzymuje rower.");
    }

    @Override
    public String info() {
        return "Rower";
    }

    public void zjedzJedzenie(){
        System.out.println("Wcinam banana, aby miec sile do jazdy na rowerze.");
    }
}