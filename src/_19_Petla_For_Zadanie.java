public class _19_Petla_For_Zadanie {
    public static void main(String[] args) {
        // 1. Wypisz liczby z zakresu 1-100 podzielne przez 3
        int startNumber = 1;
        int stopNumber = 100;
        int divider = 3;

        System.out.println("\nWypisanie liczb od " + startNumber + " do " + stopNumber + " ale jedynie podzielnych przez " + divider + ":");
        for (int i = startNumber; startNumber <= stopNumber; startNumber++){
            if (startNumber % divider == 0){
                System.out.println(startNumber);
            }
        }

        // 2. Odwroc kolejnosc elementow tablicy z [1, 3, 5, 8, 10] na [10, 8, 5, 3, 1]
        int[] numbers = new int[] {1, 3, 5, 8, 10};

        for (int j = 0; j < (numbers.length/2); j++){
            int temp = numbers[j];
            numbers[j] = numbers[numbers.length-1-j];
            numbers[numbers.length-1-j] = temp;
        }

        System.out.println("\nWypisanie odwroconej kolejnosci tablicy \"numbers\":");
        for (int j = 0; j < numbers.length; j++){
            System.out.println(numbers[j]);
        }
    }
}
