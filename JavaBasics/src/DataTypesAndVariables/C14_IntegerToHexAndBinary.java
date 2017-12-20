package DataTypesAndVariables;

import java.util.Scanner;

public class C14_IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNum = Integer.parseInt(scanner.nextLine());

        String hexNum = Integer.toHexString(decimalNum).toUpperCase();
        String binaryNum = Integer.toBinaryString(decimalNum);
        System.out.println(hexNum);
        System.out.println(binaryNum);
    }
}
