package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Μετατρέπει ένα string σε κεφαλαία-πεζά
 * εναλλάξ. πχ. : coding -> CoDiNg
 */

public class UpperLowerCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String inputStr = "";
        char ch = ' ';

        System.out.println("Παρακαλώ εισάγετε ένα string: ");
        inputStr = scanner.nextLine();

        for (int i = 0; i < inputStr.length(); i++) {
            ch = inputStr.charAt(i);
            if (Character.isLetter(ch)) {
                ch = i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                sb.append(ch);
            }

        }
        System.out.println(sb);
    }
}
