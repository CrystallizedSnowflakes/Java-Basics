package DataTypesAndVariables;

import java.util.Scanner;

public class C15_FastPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf(i + " -> ");
            System.out.println(isPrime ? "True" : "False");
        }
    }
}
