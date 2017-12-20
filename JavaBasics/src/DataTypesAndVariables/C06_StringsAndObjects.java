package DataTypesAndVariables;

import java.util.Scanner;

public class C06_StringsAndObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hello = scanner.nextLine();
        String world = scanner.nextLine();

        Object together = hello + " " + world;

        String sentence = (String) together;

        System.out.println(sentence);
    }
}
