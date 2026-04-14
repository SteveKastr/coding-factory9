package gr.aueb.cf.cf9.review.challenges;

public class RepeatedString {
    public static void main(String[] args) {
        String s = "Carcosa";
        int n = 5;

        repeatedString(s, n);
        System.out.println(s.repeat(n));

    }

    public static String repeatedString(String s, int n) {
        return s.repeat(n);
    }
}
