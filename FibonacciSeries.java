import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many terms (1-92)? ");
        int terms = sc.nextInt();

        if (terms < 1 || terms > 92) {
            System.out.println("Enter a number from 1 to 92.");
        } else {
            long first = 0, second = 1;
            for (int i = 1; i <= terms; i++) {
                System.out.print(first + (i < terms ? " " : ""));
                long next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
        sc.close();
    }
}
