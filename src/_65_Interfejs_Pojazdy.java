public interface _65_Interfejs_Pojazdy {

    // Interfejs (kontrakt) - zestaw metod bez ich implementacji (okreslamy: zwracany typ, nazwe metody ale bez ciala/zawartosci metody).
    // Cialo/zawartosc metody bedzie dostarczone przez klasy, ktore beda implementowaly nasz interfejs.

    // Nie trzeba podawac, ze metody sa "public" poniewaz w przypadku interfejsow wszystkie metody domyslnie sa "public".

    void jedz(int predkosc);
    void zatrzymajSie();
    String info();
}