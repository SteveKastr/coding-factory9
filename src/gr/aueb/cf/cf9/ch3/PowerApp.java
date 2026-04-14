package gr.aueb.cf.cf9.ch3;

/**
 * Calculates the power of a number
 */

import java.util.Arrays;
import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Παρακαλώ εισάγε το base και το power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result *= base;
            i++;
        }

        System.out.printf("%d ^ %d = %d\n ", base, power, result);
    }

}
