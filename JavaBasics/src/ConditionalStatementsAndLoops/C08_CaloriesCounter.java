package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class C08_CaloriesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int cheese = 500;
        int tomatoSauce = 150;
        int salami = 600;
        int pepper = 50;
        int calories = 0;

        for (int i = 0; i < number; i++)
        {
            String ingredient = scanner.nextLine().toLowerCase();
            switch (ingredient)
            {
                case "cheese": calories += cheese; break;
                case "tomato sauce": calories += tomatoSauce; break;
                case "salami": calories += salami; break;
                case "pepper": calories += pepper; break;
            }
        }
        System.out.printf("Total calories: %d%n", calories);
    }
}
