import java.util.Scanner;

public class HandlingException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(sc.nextLine());
            System.out.println("You entered: " + number);

            System.out.print("Enter a divisor: ");
            int divisor = Integer.parseInt(sc.nextLine());
            System.out.println("Division result: " + (number / divisor));
        } catch (NumberFormatException e) {
            System.out.println("Exception: Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero.");
        } finally {
            System.out.println("End of exception handling example.");
            sc.close();
        }
    }
}
