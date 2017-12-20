package Lists;

import java.util.*;

public class C06_SquareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Integer> squareNumbers = new ArrayList<>();
        for (String number : input) {
            Integer digit = Integer.parseInt(number);
            if (Math.sqrt(digit) == (int)Math.sqrt(digit)) {
                squareNumbers.add(digit);
            }
        }
        squareNumbers.sort(Collections.reverseOrder());

        for (Integer squareNumber : squareNumbers) {
            System.out.printf(squareNumber + " ");
        }
    }
}
