package IntroAndBasicSyntax;

import java.util.Scanner;

public class C09_Convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cBGN = Double.parseDouble(scanner.nextLine());
        double cEUR = cBGN / 1.95583;
        System.out.println(cEUR);
    }
}
