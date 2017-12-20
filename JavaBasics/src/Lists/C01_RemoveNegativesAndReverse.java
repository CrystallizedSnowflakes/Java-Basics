package Lists;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.*;
import java.util.zip.ZipEntry;

public class C01_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        String[] items = numbers.split(" "); // Array

        ArrayList<Integer> reversedPositive = new ArrayList<>();
        for (int pos = items.length - 1; pos >= 0; pos--) {
            int i = Integer.parseInt(items[pos]);
            if (i > 0) {
                reversedPositive.add(i);
            }
        }
        if (!reversedPositive.isEmpty()) {
            //for (int i = 0; i < reversedPositive.size(); i++) {
            //System.out.println(reversedPositive.get(i));
            for (Integer num : reversedPositive) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("empty");
        }
    }
}
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(-1);
//        numbers.add(1, -7); //insert 5, -7, -1
//        numbers.remove(1); //Index
//        numbers.remove(-1); //Object
//        System.out.println(numbers.indexOf(-1));
//        numbers.get(1); //index -7
//        numbers.set(1, 70); // index, element/-> numbers[1] - 70;
//        for (int number : numbers) { // foreach ()
//            System.out.println(number);
//        }
//        for (int i = 0; i < numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }
//        System.out.println(Collections.min(numbers));
//        System.out.println(Collections.max(numbers));
//        Collections.sort(numbers);
//
//        String[] arr = new String[] {"a", "b", "3"};
//        List<String> list = Arrays.asList(arr);
//        Integer[] numberArray = numbers.toArray(new String(numbers.size());
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        }        String line = reader.readLine();
//        String[] items = line.split(" ");
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//            for(String item : items){
//            numbers.add(Integer.parseInt(item));
//        }
//            for(int i = 0; i < numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }

