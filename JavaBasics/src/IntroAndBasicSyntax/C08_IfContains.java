package IntroAndBasicSyntax;

import java.util.Scanner;

public class C08_IfContains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String syllable = scanner.nextLine();
        System.out.println(word.contains(syllable));
    }
}
