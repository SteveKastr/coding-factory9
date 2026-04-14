package gr.aueb.cf.cf9.ch4;

/**
 * Εκτυπώνει 10 οριζόντια αστεράκια με for
 */
public class StarsHorizontalApp {
    public static void main(String[] args) {
        //horizontal
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println();
        //vertical
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }
        // grid 10X10
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //1,2,3,...
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //10,9,8,....
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
