package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class C06_IntervalOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        for (int i = Math.min(n, m); i <= Math.max(n, m); i++)
        {
            System.out.println(i);
        }
    }
}
