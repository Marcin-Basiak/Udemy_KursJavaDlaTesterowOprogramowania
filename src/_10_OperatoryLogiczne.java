public class _10_OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;
        boolean fifthValue = 3 > 1;
        boolean sixthValue = 3 < 1;

        // Operator && czyli AND, zwraca TRUE, gdy wszystkie wyrazenia sa rowne TRUE
        System.out.println("\n> Operator && czyli AND, zwraca TRUE, gdy wszystkie wyrazenia sa rowne TRUE:");
        System.out.println("Czy " + firstValue + " && " + secondValue + "?\n\t" + (firstValue && secondValue));
        System.out.println("\nCzy " + firstValue + " && " + fourthValue + "?\n\t" + (firstValue && fourthValue));
        System.out.println("\nCzy " + secondValue + " && " + thirdValue + "?\n\t" + (secondValue && thirdValue));
        System.out.println("\nCzy " + fifthValue + " && " + sixthValue + "?\n\t" + (fifthValue && sixthValue));

        // Operator || czyli OR, zwraca TRUE, gdy chociaz jedno wyrazenie jest rowne TRUE
        System.out.println("\n> Operator || czyli OR, zwraca TRUE, gdy chociaz jedno wyrazenie jest rowne TRUE:");
        System.out.println("Czy " + firstValue + " || " + secondValue + "?\n\t" + (firstValue || secondValue));
        System.out.println("\nCzy " + firstValue + " || " + fourthValue + "?\n\t" + (firstValue || fourthValue));
        System.out.println("\nCzy " + secondValue + " || " + thirdValue + "?\n\t" + (secondValue || thirdValue));
        System.out.println("\nCzy " + fifthValue + " || " + sixthValue + "?\n\t" + (fifthValue || sixthValue));

        // Operator ! czyli negacja, zwraca przeciwna wartosc do wyrazenia, przed ktorym sie znajduje
        System.out.println("\n> Operator ! czyli negacja, zwraca przeciwna wartosc do wyrazenia, przed ktorym sie znajduje:");
        System.out.println("Wartosc ! dla " + firstValue + ":\n\t" + (!firstValue));
        System.out.println("Wartosc ! dla " + secondValue + ":\n\t" + (!secondValue));
        System.out.println("Wartosc ! dla (" + firstValue + " && " + secondValue + "):\n\t" + !(firstValue && secondValue));
        System.out.println("Wartosc ! dla (" + firstValue + " && " + secondValue + "):\n\t" + !(firstValue && secondValue));
        System.out.println("Wartosc ! dla (" + fifthValue + " && " + sixthValue + "):\n\t" + !(fifthValue && sixthValue));
    }
}
