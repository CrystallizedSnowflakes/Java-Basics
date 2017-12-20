package Lists;

import java.util.*;

public class C07_CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String s : input){
            numbers.add(Integer.parseInt(s));
        }
        Collections.sort(numbers);
        Map<Integer, Integer> uniqueNumbers = new LinkedHashMap<>();
        for (int num : numbers)
        {
            if (uniqueNumbers.containsKey(num))
            {
                uniqueNumbers.put(num, uniqueNumbers.get(num) + 1);
            }
            else
            {
                uniqueNumbers.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : uniqueNumbers.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
