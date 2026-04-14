package gr.aueb.cf.cf9.ch3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Παρακαλώ εισάγετε αν βρέχει (true/false)" );
        isRaining = scanner.nextBoolean();
        System.out.println("Παρακαλώ εισάγετε την θερμοκρασία");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.println("Is Snowing  " +  isSnowing);

    }
}
