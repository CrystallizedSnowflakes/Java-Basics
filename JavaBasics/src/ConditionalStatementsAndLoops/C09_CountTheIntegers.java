package ConditionalStatementsAndLoops;

import java.io.IOException;
import java.util.Scanner;
import java.lang.Exception;

public class C09_CountTheIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        try
        {
            while (true) {
                int input = Integer.parseInt(scanner.nextLine());
                counter++;
            }
        }
        catch  (Exception e) {
            System.out.print(counter);
        }
    }
}
