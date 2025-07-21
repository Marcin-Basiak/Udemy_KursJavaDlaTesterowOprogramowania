public class _57_PrzeciazanieMetod {
    // Przeciazanie metody (method overloading) wystepuje, gdy w klasie znajduje sie wiecej niz 1 metoda o tej samej nazwie ale z roznymi parametrami.
    // W przeciazaniu metod brane sa pod uwage: liczba parametrow (0, 1, 2, 3) oraz typ danych tych parametrow (int, String)

    public void dodaj(){
        System.out.println("Przeciazenie metody \"dodaj\". Metoda bez parametrow.");
    }

    public void dodaj(int a){
        System.out.println("Przeciazenie metody \"dodaj\". Metoda z 1 parametrem typu int.");
        System.out.println("\tSuma liczb a, to: " + a);
    }

    public void dodaj(int a, int b){
        System.out.println("Przeciazenie metody \"dodaj\". Metoda z 2 parametrami typu int.");
        System.out.println("\tSuma liczb a+b, to: " + (a + b));
    }

    public void dodaj(int a, int b, int c){
        System.out.println("Przeciazenie metody \"dodaj\". Metoda z 3 parametrami typu int.");
        System.out.println("\tSuma liczb a+b+c, to: " + (a + b + c));
    }

    public void dodaj(String a){
        System.out.println("Przeciazenie metody \"dodaj\". Metoda z 1 parametrem typu String.");
        System.out.println("\tSuma liczb a, to: " + a);
    }
}