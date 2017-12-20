package DataTypesAndVariables;

import java.util.Scanner;

public class C03_PracticeCharsAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        String newSentence = scanner.nextLine();

        System.out.println(sentence);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(newSentence);
    }
}
