package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class C03_RestaurantDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String servicePackage = scanner.nextLine();
        String hallName = "";
        double price = 0.0;
        double discount;

        if (group >= 0 && group <= 50) {
            hallName = "Small Hall";
            if (servicePackage.equals("Normal")) {
                price = 2500 + 500;
                discount = price * 0.05;
                price = (price - discount) / group;
            } else if (servicePackage.equals("Gold")) {
                price = 2500 + 750;
                discount = price * 0.10;
                price = (price - discount) / group;
            } else if (servicePackage.equals("Platinum")) {
                price = 2500 + 1000;
                discount = price * 0.15;
                price = (price - discount) / group;
            }
        } else if (group > 50 && group <= 100) {
            hallName = "Terrace";
            switch (servicePackage) {
                case "Normal":
                    price = 5000 + 500;
                    discount = price * 0.05;
                    price = (price - discount) / group;
                    break;
                case "Gold":
                    price = 5000 + 750;
                    discount = price * 0.10;
                    price = (price - discount) / group;
                    break;
                case "Platinum":
                    price = 5000 + 1000;
                    discount = price * 0.15;
                    price = (price - discount) / group;
                    break;
            }
        } else if (group > 100 && group <= 120) {
            hallName = "Great Hall";
            switch (servicePackage) {
                case "Normal":
                    price = 7500 + 500;
                    discount = price * 0.05;
                    price = (price - discount) / group;
                    break;
                case "Gold":
                    price = 7500 + 750;
                    discount = price * 0.10;
                    price = (price - discount) / group;
                    break;
                case "Platinum":
                    price = 7500 + 1000;
                    discount = price * 0.15;
                    price = (price - discount) / group;
                    break;
            }
        } else {
            System.out.println("We do not have an appropriate hall.");
            return;
        }
        System.out.printf("We can offer you the %s%n", hallName);
        System.out.printf("The price per person is %.2f$", price);
    }
}
