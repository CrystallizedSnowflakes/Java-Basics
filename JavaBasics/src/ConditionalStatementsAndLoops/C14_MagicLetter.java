package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class C14_MagicLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.nextLine().toLowerCase().charAt(0);
        char secondLetter = scanner.nextLine().toLowerCase().charAt(0);
        char ignoredLetter = scanner.nextLine().toLowerCase().charAt(0);

        for (char s1 = firstLetter; s1 <= secondLetter; s1++)
        {
            for (char s2 = firstLetter; s2 <= secondLetter; s2++)
            {
                for (char s3 = firstLetter; s3 <= secondLetter; s3++)
                {
                    if (s1 != ignoredLetter && s2 != ignoredLetter && s3!= ignoredLetter)
                    {
                        System.out.printf("%c%c%c ", s1, s2, s3);
                    }
                }
            }
        }
        System.out.println();
    }
}
