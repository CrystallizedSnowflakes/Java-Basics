package IntroAndBasicSyntax;

import java.util.Scanner;

public class C07_AreaOfTRiangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        System.out.println((base * height / 2));
    }
}
