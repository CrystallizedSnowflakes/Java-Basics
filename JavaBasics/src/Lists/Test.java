package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] text = input.split("[ \\[\\],;\\\\:.!/()\"']+");

        ArrayList<String> sentence = new ArrayList<>();

        sentence.addAll(Arrays.asList(text));
//        for (String word : text) {
//            sentence.add(word);
//        }

        ArrayList<String> lowerCaseWords = new ArrayList<>();
        ArrayList<String> mixedCaseWords = new ArrayList<>();
        ArrayList<String> upperCaseWords = new ArrayList<>();

        for (String word : sentence) {
            boolean isMixed = false;
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isLetter(word.charAt(i))) {
                    isMixed = true;
                    break;
                }
            }
            if (word.toUpperCase().equals(word) && !isMixed && !word.isEmpty()) {
                upperCaseWords.add(word);
            } else if (word.toLowerCase().equals(word) && !isMixed && !word.isEmpty()) {
                lowerCaseWords.add(word);
            } else if (!word.isEmpty()) {
                mixedCaseWords.add(word);
            }
        }
        System.out.println("Lower-case: " + String.join(", ", lowerCaseWords));
        System.out.println("Mixed-case: " + String.join(", ", mixedCaseWords));
        System.out.println("Upper-case: " + String.join(", ", upperCaseWords));
    }
}
