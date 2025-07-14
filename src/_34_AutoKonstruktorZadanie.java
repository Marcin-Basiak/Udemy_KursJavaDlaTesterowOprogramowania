// Modyfikacja "_20_Auto" na wykorzystanie konstruktora

public class _34_AutoKonstruktorZadanie {

    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;

    // Konstruktor domyslny
    public _34_AutoKonstruktorZadanie(){

    }

    // Konstruktor z parametrami
    public _34_AutoKonstruktorZadanie(String marka, String model, int rokProdukcji, int przebieg){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public  void jedz(){
        System.out.println("Jedz!");
    }

    public void hamuj(){
        System.out.println("Hamuj!");
    }

    public void informacje(){
        System.out.println("Marka:" + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
        System.out.println("\n");
    }
}
