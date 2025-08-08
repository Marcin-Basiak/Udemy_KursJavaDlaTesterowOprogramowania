package _83_Interview;

public class _2_CzyWyrazJestPalindromem {

    // ZADANIE:
    // Sprawdz, czy podany wyraz jest palindromem (czyli czytany od prodzu i od tylu daje ten sam efekt np. "kajak").
    // Zwroc wartosc "true" jesli wyraz jest palindromem i wartosc "false", gdy nie jest palindromem.

    public static void main(String[] args) {
        System.out.println("Czy podane slowo jest palindromem: " + czyPalindrom("kajak"));
    }

    public static boolean czyPalindrom(String slowo){
        int dlugoscSlowa = slowo.length();
        for(int i=0; i < (dlugoscSlowa/2); i++){
            if(slowo.charAt(i) != slowo.charAt(dlugoscSlowa-i-1)){
                return false;
            }
        }
        return true;
    }
}