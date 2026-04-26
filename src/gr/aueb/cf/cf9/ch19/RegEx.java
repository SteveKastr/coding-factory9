package gr.aueb.cf.cf9.ch19;

public class RegEx {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(isHello(s));

        String s1 = ".4";
        System.out.println(dotAndDigit(s1));

    }

    public static boolean isHello(String s) {
        return s.matches("Hello");
    }

    public static boolean isHelloorHi(String s) {
        return s.matches("Hello|Hi");
    }

    public static boolean isHhello(String s) {
        return s.matches("[Hh]ello");
    }

    public static boolean startsWithUppercase(String s) {
        return s.matches("[A-Z]coding");
    }
    public static boolean startsWithUppeOrLowercase(String s) {
        return s.matches("[A-Za-z]coding");
    }
    public static boolean startsWithLetter(String s) {
        return s.matches("[a-zA-Z0-9_]coding");
    }

    //Μεταχαρακτήρες
    public static boolean anyCharAndDigit(String s) {
        return s.matches(".\\d"); // .[0-9]
    }
    public static boolean dotAndDigit(String s) {
        return s.matches("\\.\\d");
    }

    // dd/mm/yyyy
    public static boolean isDateMonthYear (String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }
}
