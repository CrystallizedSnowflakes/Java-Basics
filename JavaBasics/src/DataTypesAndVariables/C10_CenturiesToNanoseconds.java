package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class C10_CenturiesToNanoseconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        int days = (int)(years * 365.2422);
        int hours = days * 24;
        BigDecimal minutes = new BigDecimal(hours * 60);
        //BigDecimal seconds = new BigDecimal(minutes * 60);

        //decimal milliseconds = seconds * 1000;
        //decimal microseconds = milliseconds * 1000;
        //decimal nanoseconds = microseconds * 1000;

        //System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes = %d seconds = %d milliseconds = %d microseconds = %d nanoseconds", centuries, years, days, hours, minutes, seconds, milliseconds, microseconds, nanoseconds);
    }
}
