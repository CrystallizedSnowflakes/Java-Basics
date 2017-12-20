package DataTypesAndVariables;

import java.util.Scanner;

public class C16_ComparingFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOne = Double.parseDouble(scanner.nextLine());
        double numTwo = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;

        boolean isEqual = (Math.abs(numOne - numTwo)) < eps;

        System.out.printf(isEqual ? "True" : "False");
    }
}
