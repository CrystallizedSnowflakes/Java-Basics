package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C05_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] digits = input.split(" ");

        ArrayList<Double> numbers = new ArrayList<>();

        for (String  digit : digits){
            numbers.add(Double.parseDouble(digit));
        }
        Collections.sort(numbers);

        for(int i = 0; i < numbers.size()-1; i++ ) {
            System.out.print(numbers.get(i) + " <= ");
        }
        System.out.println(numbers.get(numbers.size() - 1));
    }
}
