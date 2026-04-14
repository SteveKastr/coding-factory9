package gr.aueb.cf.cf9.ch8;

public class IndexOutOfBoundsExceptionApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i <= arr.length; i++) { //σωστό είναι το < σκέτο ή <=arr.length - 1;
            System.out.println(arr[i]);
        }
    }
}
