package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα ποσό (ακέραιος) σε Ευρό και μετατρέπει σε δολάρια ΗΠΑ πχ. αν 1 Ευρο είναι 99 cents
 */

public class EuroToUsdConverter {

    public static void main(String[] args) {
        int inputEuros = 0;
        int usaDollars = 0;
        int usaCents = 0;
        int totalUsaCents = 0;
        final int CONVERT = 99;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ γράψτε το ποσό σε Ευρώ (ακέραιος αριθμός) ");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * CONVERT;
        usaDollars = totalUsaCents  / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("Το ποσό %d Euros σε δολάρια είναι %,d USD και %d USD Cents\n", inputEuros, usaDollars, usaCents);
    }
}
