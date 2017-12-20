package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class C01_ChooseADrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String profession = scanner.nextLine();
        switch (profession){
            case "Athlete":
                System.out.printf("Water"); break;
            case "Businessman":
            case "Businesswoman":
                System.out.printf("Coffee"); break;
            case "SoftUni Student":
                System.out.printf("Beer"); break;
            default:
                System.out.printf("Tea"); break;
        }
    }
}
