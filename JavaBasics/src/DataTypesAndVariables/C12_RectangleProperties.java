package DataTypesAndVariables;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C12_RectangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double perimeter = 2 * (width + height);
        double area = width * height;
        double diagonal = Math.sqrt((width * width) + (height * height));

        DecimalFormat df = new DecimalFormat("#.#############");

        System.out.println(df.format(perimeter));
        System.out.println(df.format(area));
        System.out.println(df.format(diagonal));
    }
}
