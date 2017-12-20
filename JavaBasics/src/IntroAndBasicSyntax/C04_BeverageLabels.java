package IntroAndBasicSyntax;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C04_BeverageLabels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int volume = Integer.parseInt(scanner.nextLine());
        int energy = Integer.parseInt(scanner.nextLine());
        int sugar = Integer.parseInt(scanner.nextLine());

        double energyContent = volume * energy / 100.0;
        double sugarContent = volume * sugar / 100.0;

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("%dml %s:%n", volume, name);
        System.out.printf("%skcal, %sg sugars", df.format(energyContent), df.format(sugarContent));
    }
}
