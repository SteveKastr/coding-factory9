package gr.aueb.cf.cf9.ch5;

/**
 * Υπολογίζει τη δύναμη a^b με μέθοδο
 */

import java.util.Scanner;

public class PowerMethodApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int result = 0;
        int power = 0;

        System.out.println("Please enter two numbers: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = power (base, power);

        System.out.printf("%d ^ %d = %d\n ", base, power, result);


    }
    public static int power(int base, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        return result;

    }
}
