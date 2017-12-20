package Lists;

import java.util.*;

public class C07_CountNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : input){
            numbers.add(Integer.parseInt(s));
        }
        Collections.sort(numbers);
        Map<Integer, Integer> uniqueNumbers = new LinkedHashMap<>();
        for (Integer number : numbers){
            if (!uniqueNumbers.containsKey(number)) {
                uniqueNumbers.put(number, 1);
            } else {
                uniqueNumbers.put(number, uniqueNumbers.get(number) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : uniqueNumbers.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
