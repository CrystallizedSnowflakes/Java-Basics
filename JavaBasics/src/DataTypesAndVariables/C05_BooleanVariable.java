package DataTypesAndVariables;

import java.util.Scanner;

public class C05_BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        boolean isBoolean = Boolean.parseBoolean(name);

        System.out.print(isBoolean ? "Yes" : "No");
    }
}
