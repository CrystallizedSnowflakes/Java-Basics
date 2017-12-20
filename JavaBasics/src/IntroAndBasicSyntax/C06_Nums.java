package IntroAndBasicSyntax;

import java.util.Scanner;

public class C06_Nums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            String asterisks = new String(new char[i]).replace("\0", "*");
            String spaces = new String(new char[n-i]).replace("\0", " ");
            System.out.printf(spaces);
            System.out.printf(asterisks);
            System.out.printf(" | ");
            System.out.printf(asterisks);
            System.out.println(spaces);
        }
    }
}
