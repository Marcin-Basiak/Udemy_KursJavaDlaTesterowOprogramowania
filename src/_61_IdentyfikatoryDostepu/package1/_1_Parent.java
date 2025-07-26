package _61_IdentyfikatoryDostepu.package1;

// Podczas dziedziczenia rozpoznajemy 4 modyfikatory: public, default, protected, private.
public class _1_Parent {

    // Identyfikator dostepu "public"
    public String first_Public = "public";

    // Domyslny identyfikator dostepu (dostep do pola klasy jedynie z klasy z tej samej paczki)
    String second_Default = "default";

    // Identyfikator dostepu "protected" (dostep do pola klasy jedynie, gdy jest dziedziczenie "extends" z klasy "_1_Parent")
    protected String third_Protected = "protected";

    // Identyfikator dostepu "private" (dostep do pola klasy jedynie z tej klasy "_1_Parent")
    private String fourth_Private = "private";



    public void firstMethod_Public(){
        System.out.println("public");
    }

    // Metoda z identyfikatorem dostepu "private" (dostep do metody jedynie z klasy z tej samej paczki)
    void secondMethod_Default(){
        System.out.println("default");
    }

    // Metoda z identyfikatorem dostepu "private" (dostep do metody jedynie, gdy jest dziedziczenie "extends" z klasy "_1_Parent")
    protected void thirdMethod_Protected(){
        System.out.println("protected");
    }

    // Metoda z identyfikatorem dostepu "private" (dostep do metody jedynie z tej klasy "_1_Parent")
    private void fourthMethod_Private(){
        System.out.println("private");
    }



    // Wywolanie metod w tej samej klasie, w ktorej zostaly stworzone/zdefiniowane
    public void testMethodParent(){
        // Odwolanie do pol
        System.out.println(first_Public);
        System.out.println(second_Default);
        System.out.println(third_Protected);
        System.out.println(fourth_Private);

        // Odwolanie do metod
        firstMethod_Public();
        secondMethod_Default();
        thirdMethod_Protected();
        fourthMethod_Private();
    }
}