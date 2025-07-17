// Klasa potomna/podrzedna "_42_Pilkarz" rozszerza (extends) klase bazowa/nadrzedna "_41_OsobaDziedziczenie"
// Czyli klasa "_42_Pilkarz" ma dostep do pol i metod z klasy "_41_OsobaDziedziczenie"

public class _42_Pilkarz extends _41_OsobaDziedziczenie {

    public String nazwaKlubu;

    public void grajWPilke(){
        System.out.println("Lubie grac w pilke w zespole " + nazwaKlubu);
    }
}