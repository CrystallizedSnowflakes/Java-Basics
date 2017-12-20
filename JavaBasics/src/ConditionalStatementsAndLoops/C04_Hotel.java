package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class C04_Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0.0;
        double priceDouble = 0.0;
        double priceSuite = 0.0;

        if (nights > 0 && nights <= 7)
        {
            switch (month){
            case "May":
            case "October":
                priceStudio = 50 * nights;
                priceDouble = 65 * nights;
                priceSuite = 75 * nights;
                break;
            case "June":
            case "September":
                priceStudio = 60 * nights;
                priceDouble = 72 * nights;
                priceSuite = 82 * nights;
                break;
            case "July":
            case "August":
            case "December":
                priceStudio = 68 * nights;
                priceDouble = 77 * nights;
                priceSuite = 89 * nights;
                break;
            }
        }
        else if (nights > 7 && nights <= 14)
        {
            switch (month){
            case "May":
                priceStudio = 50 * 0.95 * nights;
                priceDouble = 65 * nights;
                priceSuite = 75 * nights;
                break;
            case "October":
                priceStudio = 50 * 0.95 * (nights - 1);
                priceDouble = 65 * nights;
                priceSuite = 75 * nights;
                break;
            case "June":
                priceStudio = 60 * nights;
                priceDouble = 72 * nights;
                priceSuite = 82 * nights;
                break;
            case "September":
                priceStudio = 60 * (nights - 1);
                priceDouble = 72 * nights;
                priceSuite = 82 * nights;
                break;
            case "July":
            case "August":
            case "December":
                priceStudio = 68 * nights;
                priceDouble = 77 * nights;
                priceSuite = 89 * nights;
            }
        }
        else if (nights > 14)
        {
            switch (month){
            case "May":
            case "October":
                priceStudio = 50 * nights;
                priceDouble = 65 * nights;
                priceSuite = 75 * nights;
                break;
            case "June":
            case "September":
                priceStudio = 60 * nights;
                priceDouble = 72 * 0.90 * nights;
                priceSuite = 82 * nights;
                break;
                case "July":
                case "August":
                case "December":
                priceStudio = 68 * nights;
                priceDouble = 77 * nights;
                priceSuite = 89 * 0.85 * nights;
                break;
            }
        }
        System.out.printf("Studio: %.2f lv.%n", priceStudio);
        System.out.printf("Double: %.2f lv.%n", priceDouble);
        System.out.printf("Suite: %.2f lv.%n", priceSuite);
    }
}
