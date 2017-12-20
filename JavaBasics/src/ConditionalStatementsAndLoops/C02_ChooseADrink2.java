package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class C02_ChooseADrink2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String profession = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (profession){
            case "Athlete":
                System.out.printf("The " + profession +  " has to pay %.2f.", quantity * 0.70);
                break;
            case "Businessman":
            case "Businesswoman":
                System.out.printf("The " + profession + " has to pay %.2f.", quantity * 1.00);
                break;
            case "SoftUni Student":
                System.out.printf("The " + profession + " has to pay %.2f.", quantity * 1.70);
                break;
            default:
                System.out.printf("The " + profession + " has to pay %.2f.", quantity * 1.20);
                break;
        }
    }
}
