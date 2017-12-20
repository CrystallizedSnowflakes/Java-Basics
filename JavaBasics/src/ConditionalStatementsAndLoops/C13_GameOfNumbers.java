package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class C13_GameOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        String lastCombination = "";
        int i;
        int j;

        for (i = n; i <= m; i++) {
            for (j = n; j <= m; j++) {
                counter++;
                if (i + j == magicNum && i > j) {
                    lastCombination = "Number found! " + i + " + " + j + " = " + magicNum;
                }
            }
        }
        if (lastCombination.equals("")) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        } else {
            System.out.printf(lastCombination);
        }
    }
}
