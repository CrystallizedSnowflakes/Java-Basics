package ConditionalStatementsAndLoops;

import java.util.Scanner;
import java.lang.String;

public class C05_WordInPlural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nadia substr: [" + "nadia".substring(1, 3) + "]");

        String word = scanner.nextLine();
        char one = word.charAt(word.length() - 1);
        char two = word.charAt(word.length() - 2);

        if (one == 'y')
        {
            word = word.substring(0, word.length() - 1);
            System.out.printf(word + "ies");
        }
        else if (one == 'o' || one == 's' || one == 'x' || one == 'z' || (one == 'h' && two == 'c' || two == 's'))
        {
            System.out.printf(word + "es");
        }
        else
        {
            System.out.printf(word + "s");
        }
    }
}
