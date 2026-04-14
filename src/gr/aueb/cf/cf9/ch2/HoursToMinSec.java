package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

public class HoursToMinSec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int MUL_60 = 60;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Παρακαλώ γράψτε τον αριθμό της ώρας");
        hours = scanner.nextInt();
        minutes = hours * MUL_60;
        seconds = minutes * MUL_60;

        System.out.printf(Locale.US, "Ο αριθμός λεπτών στην ώρα είναι: %,d\n", minutes);
        System.out.printf(Locale.forLanguageTag("el"), "Ο αριθμός των δευτερώλεπτων στην ώρα είναι: %,d\n", seconds);
    }
}
