package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class C02_AppendLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String input = scanner.nextLine();
        String input = " 2 3 |4 5 6 |  7  8";
        String[] tokens = input.split("\\|");
        ArrayList<String> result = new ArrayList<>();
        for (int pos = tokens.length - 1; pos >= 0; pos--)
        {
            String splittedArr = tokens[pos].replaceAll("\\s+"," ").trim();
            result.add(splittedArr);
        }
        System.out.println(String.join(" ", result));
    }
}
