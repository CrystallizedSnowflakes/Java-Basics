package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class C08_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputArr[] = scanner.nextLine().split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String number : inputArr){
            numbers.add(Integer.parseInt(number));
        }
        //ArrayList<Integer> maxSequenceOfEqualElements = findMaxSequenceOfEqualElements(numbers);
        //System.out.println(String.join(" ", maxSequenceOfEqualElements.toString()));

    //public static int[] findMaxSequenceOfEqualElements(int[] arr) {
        ArrayList<Integer> longestSequence = new ArrayList<>();
        ArrayList<Integer> currentSequence = new ArrayList<>();
        //currentSequence.add(arr[0]); //set first element
        //for (Integer a : arr)
            //Integer currentNum = a;
            //int searchNum = currentSequence[0];
        //return arr;
        //}
    }
}
