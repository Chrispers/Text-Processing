import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] array = text.toCharArray();
        for (char c : array) {
            char newChar = (char) ((int) c + 3);
            System.out.print(newChar);
        }
    }
}
