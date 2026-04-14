package gr.aueb.cf.cf9.ch3;

import java.util.Arrays;
import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. Εισαγωγή σίτησης");
            System.out.println("2. Διαγραφή Αίτησης");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using the program");
    }
}
