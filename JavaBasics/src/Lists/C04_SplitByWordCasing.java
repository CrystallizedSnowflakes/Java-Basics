package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class C04_SplitByWordCasing {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] text = input.split("[ \\[\\],;\\\\:.!/()\"']+");

        ArrayList<String> lowerCaseWords = new ArrayList<>();
        ArrayList<String> mixedCaseWords = new ArrayList<>();
        ArrayList<String> upperCaseWords = new ArrayList<>();

        for(String word : text) {
            boolean isMixed = false;
            for (int i = 0; i < word.length(); i++) {
                if (!Character.isLetter(word.charAt(i))) {
                    isMixed = true;
                    break;
                }
            }
            if (!isMixed && !word.isEmpty() && word.toUpperCase().equals(word)) {//!check -> check == false
                upperCaseWords.add(word);
            } else if (!isMixed && !word.isEmpty() && word.toLowerCase().equals(word)) {
                lowerCaseWords.add(word);
            } else if (!word.isEmpty()) {
                mixedCaseWords.add(word);
            }
        }
        System.out.println("Lower-case: "+String.join(", ",lowerCaseWords));
        System.out.println("Mixed-case: "+String.join(", ",mixedCaseWords));
        System.out.println("Upper-case: "+String.join(", ",upperCaseWords));
    }
}
