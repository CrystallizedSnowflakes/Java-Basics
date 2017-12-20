package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class C12_TestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int maxSum = Integer.parseInt(scanner.nextLine());

        int count = 0;

        int totalSum = 0;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= m; j++) {
                totalSum += (i * j) * 3;
                count++;
                if (totalSum >= maxSum) {
                    System.out.printf("%d combinations%n", count);
                    System.out.printf("Sum: %d >= %d", totalSum, maxSum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations%n", count);
        System.out.printf("Sum: %d%n", totalSum);
    }
}
