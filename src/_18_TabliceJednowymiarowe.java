public class _18_TabliceJednowymiarowe {
    public static void main(String[] args) {
        // Pierwszy sposob deklaracji tablicy
        String[] names = new String[3];
        names[0] = "Adam";
        names[1] = "Kasia";
        names[2] = "Tomek";

        System.out.println("\nPierwszy [0] element tablicy \"names\", to " + names[0]);
        System.out.println("Drugi [1] element tablicy \"names\", to " + names[1]);
        System.out.println("Trzeci [2] element tablicy \"names\", to " + names[2]);
        System.out.println("Tablica \"names\" zawiera " + names.length + " elementy.");

        // Drugi sposob deklaracji tablicy
        int[] numbers = new int[] {2, 5, 12, 25, 56};

        System.out.println("\nPierwszy [0] element tablicy \"numbers\", to " + numbers[0]);
        System.out.println("Drugi [1] element tablicy \"numbers\", to " + numbers[1]);
        System.out.println("Trzeci [2] element tablicy \"numbers\", to " + numbers[2]);
        System.out.println("Czwarty [3] element tablicy \"numbers\", to " + numbers[3]);
        System.out.println("Piaty [4] element tablicy \"numbers\", to " + numbers[4]);
        System.out.println("Tablica \"numbers\" zawiera " + numbers.length + " elementow.");

        System.out.println("\nWypisanie wszystkich elementow tablicy \"numbers\":");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}
