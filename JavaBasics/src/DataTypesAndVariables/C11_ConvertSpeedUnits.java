package DataTypesAndVariables;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.RoundingMode;

public class C11_ConvertSpeedUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        byte hours = Byte.parseByte(scanner.nextLine());
        byte minutes = Byte.parseByte(scanner.nextLine());
        byte seconds = Byte.parseByte(scanner.nextLine());

        int time = hours * 3600 + minutes * 60 + seconds;

        float meterSpeed = (float)meters / time;
        float kilometerSpeed = ((float)meters / 1000) / ((float)time / 3600);
        float mileSpeed = ((float)meters / 1609) / ((float)time / 3600);

        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.HALF_UP);
        //System.out.format("%,8f%n", meterSpeed);

        System.out.printf("%s%n", df.format(meterSpeed));
        System.out.printf("%s%n", df.format(kilometerSpeed));
        System.out.printf("%s%n", df.format(mileSpeed));
    }
}
