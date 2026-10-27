import java.util.Scanner;

public class WordCountInText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine().trim();

        int count = text.isEmpty() ? 0 : text.split("\\s+").length;
        System.out.println("Number of words: " + count);
        sc.close();
    }
}
