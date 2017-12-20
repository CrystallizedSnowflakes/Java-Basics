package DataTypesAndVariables;

import java.util.Scanner;

public class C04_VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hex = scanner.nextLine().substring(2);
        // Convert it back to a number.
        Integer number = Integer.parseInt(hex, 16);
        System.out.printf("%d%n", number);
    }
}
