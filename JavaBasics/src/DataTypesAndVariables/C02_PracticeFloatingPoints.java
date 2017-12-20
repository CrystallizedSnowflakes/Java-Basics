package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class C02_PracticeFloatingPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        double s2 = Double.parseDouble(scanner.nextLine());
        String s3 = scanner.nextLine();

        BigDecimal bd1 = new BigDecimal(s1);
        BigDecimal bd3 = new BigDecimal(s3);

        System.out.println(bd1);
        System.out.println(s2);
        System.out.println(bd3);
    }
}
