import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int remaining = number;
        long reversed = 0;
        while (remaining != 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
