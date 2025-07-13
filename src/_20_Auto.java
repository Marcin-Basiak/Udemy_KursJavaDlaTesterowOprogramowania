public class _20_Auto {

    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;

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
