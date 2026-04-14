package gr.aueb.cf.cf9.ch3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Βρίσκει το παραγοντικό n! = 1 * 2 * 3 * .... * n
 */

public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nFactorial = 0;
        int i = 1;
        int result = 1;

        System.out.println("Παρακαλώ εισάγεται τον ακέραιο αριθμό που θέλετε");
        nFactorial = scanner.nextInt();

        while (i <= nFactorial) {
           result *= i;
            i++;

        }

        System.out.printf("%d! = %d\n ", nFactorial, result);

    }
}
