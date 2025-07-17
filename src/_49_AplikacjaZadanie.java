public class _49_AplikacjaZadanie {

    public String nazwaAplikacji;
    public String wersjaAplikacji;

    public _49_AplikacjaZadanie(String nazwaAplikacji, String wersjaAplikacji){
        this.nazwaAplikacji = nazwaAplikacji;
        this.wersjaAplikacji = wersjaAplikacji;
    }

    public void informacjeOAplikacji(){
        System.out.println("\tNazwa aplikacji: " + nazwaAplikacji);
        System.out.println("\tWersja aplikacji: " + wersjaAplikacji);
    }
}