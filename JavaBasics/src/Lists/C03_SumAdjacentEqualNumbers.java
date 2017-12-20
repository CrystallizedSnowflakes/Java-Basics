package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
//        String input = "3 3 6 1";
        String[] items = input.split(" ");
        ArrayList<Double> nums = new ArrayList<>();
        for (String item : items) {
            //double i = Double.parseDouble(items[pos]);
            //nums.Add(i);
            nums.add(Double.parseDouble(item));
        }
        boolean check = true;
        while (check)
        {
            check = false;
            for (int pos = 0; pos < nums.size(); pos++) // till previous pos
            {
                if ((pos < nums.size() - 1) && (nums.get(pos).equals(nums.get(pos + 1))))
                {
                    nums.set(pos, nums.get(pos) + nums.get(pos + 1));
                    nums.remove(pos + 1);
                    check = true;
                }
            }
        }
        System.out.println(String.join(" ", nums.toString()));
    }
}

