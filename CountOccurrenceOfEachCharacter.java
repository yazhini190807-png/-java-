import java.util.Scanner;

public class CountOccurrenceOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean[] counted = new boolean[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (counted[i] || text.charAt(i) == ' ') continue;

            int count = 1;
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(text.charAt(i) + " : " + count);
        }
        sc.close();
    }
}
