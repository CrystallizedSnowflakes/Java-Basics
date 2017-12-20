package IntroAndBasicSyntax;

import java.util.Scanner;

public class C05_CharacterStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int health = Integer.parseInt(scanner.nextLine());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        int energy = Integer.parseInt(scanner.nextLine());
        int maxEnergy = Integer.parseInt(scanner.nextLine());

        System.out.printf("Name: %s%n", name);
        System.out.printf("Health: |%s%s|%n", repeatStr("|", health), repeatStr(".", maxHealth - health));
        System.out.printf("Energy: |%s%s|", repeatStr("|", energy), repeatStr(".", maxEnergy - energy));
    }
    public static String repeatStr(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++){
            text += strToRepeat;
        }
        return text;
    }
}
