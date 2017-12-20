package DataTypesAndVariables;

import java.util.Scanner;

public class C01_PracticeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte num1 = Byte.parseByte(scanner.nextLine());
        short num2 = Short.parseShort(scanner.nextLine());
        short num3 = Short.parseShort(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());
        long num5 = Long.parseLong(scanner.nextLine());
        int num6 = Integer.parseInt(scanner.nextLine());
        long num7 = Long.parseLong(scanner.nextLine());

        System.out.printf("%d%n", num1);
        System.out.printf("%d%n", num2);
        System.out.printf("%d%n", num3);
        System.out.printf("%d%n", num4);
        System.out.printf("%d%n", num5);
        System.out.printf("%d%n", num6);
        System.out.printf("%d%n", num7);
    }
}
