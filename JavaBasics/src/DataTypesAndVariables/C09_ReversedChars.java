package DataTypesAndVariables;

import java.util.Scanner;

public class C09_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c%n", c, b, a);
    }
}
