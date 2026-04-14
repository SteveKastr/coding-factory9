package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class YearsToDays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int inputAgeInYears = 0;
        int ageInDays = 0;

        System.out.println("Παρακαλώ εισάγετε την ηλικία σας");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        System.out.printf("Ηλικία σε έτη: %d, Ηλικία σε ημέρες: %,d\n", inputAgeInYears, ageInDays);

    }
}
