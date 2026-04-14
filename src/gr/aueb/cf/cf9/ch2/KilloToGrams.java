package gr.aueb.cf.cf9.ch2;

import java.util.Arrays;
import java.util.Scanner;

public class KilloToGrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int KILLO_TO_GRAMS = 1_000;
        int inputKillo = 0;
        int killoToGrams = 0;

        System.out.println("Παρακαλώ γράψτε το βάρος σας σε κιλά:");
        inputKillo = scanner.nextInt();
        killoToGrams = inputKillo * KILLO_TO_GRAMS;

        System.out.printf("Το βάρος σας σε γραμμάρια είναι: %,d\n", killoToGrams);
    }
}
