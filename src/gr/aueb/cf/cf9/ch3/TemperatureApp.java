package gr.aueb.cf.cf9.ch3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο που συμβολίζει μία θερμοκρασία. Το πρόγραμμα υπολογίζει αν η
 * θερμοκρασία < 0 τότε μία μεταβλητή γίνεται true, αλλιώς γίνεται false.
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("Παρακαλώ εισάγεται μία θερμοκρασία");
        temperature = scanner.nextInt();

        isTempBelowZero = temperature < 0;

        System.out.println("Η θερμοκρασία είναι μικρότερη από το 0: " + isTempBelowZero);
    }
}
