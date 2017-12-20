package ConditionalStatementsAndLoops;

import java.util.Scanner;

public class C15_NeighbourWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int damagePesho = Integer.parseInt(scanner.nextLine());
        int damageGosho = Integer.parseInt(scanner.nextLine());

        int pointsPesho = 100;
        int pointsGosho = 100;

        int turns = 1;

        while (pointsPesho > 0 || pointsGosho > 0 ) {
            if (turns % 2 == 0) {
                pointsPesho -= damageGosho;
                if (pointsPesho > 0) {
                    System.out.printf("Gosho used Thunderous fist and reduced Pesho to %d health.%n", pointsPesho);
                } else {
                    System.out.printf("Gosho won in %dth round.%n", turns);
                    break;
                }
            } else {
                pointsGosho -= damagePesho;
                if (pointsGosho > 0) {
                    System.out.printf("Pesho used Roundhouse kick and reduced Gosho to %d health.%n", pointsGosho);
                } else {
                    System.out.printf("Pesho won in %dth round.%n", turns);
                    break;
                }
            }
            if (turns % 3 == 0) {
                pointsPesho += 10;
                pointsGosho += 10;
            }
            turns++;
        }
    }
}
