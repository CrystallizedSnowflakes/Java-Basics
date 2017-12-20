package DataTypesAndVariables;

import java.util.Scanner;

public class C08_EmployeeData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        long personalID = Long.parseLong(scanner.nextLine());
        int employeeID = Integer.parseInt(scanner.nextLine());

        System.out.printf("First name: %s%n", firstName);
        System.out.printf("Last name: %s%n", lastName);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Gender: %c%n", gender);
        System.out.printf("Personal ID: %d%n", personalID);
        System.out.printf("Unique Employee number: %d%n", employeeID);
    }
}
