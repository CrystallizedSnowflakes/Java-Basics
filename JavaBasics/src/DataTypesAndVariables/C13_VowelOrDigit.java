package DataTypesAndVariables;

import java.util.Scanner;

public class C13_VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        if (symbol >= 48 && symbol <= 57) {
            System.out.println("digit");
        } else if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'y') {
            System.out.println("vowel");
        } else {
            System.out.println("other");
        }
    }
}
