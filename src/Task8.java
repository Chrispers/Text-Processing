import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("[ ]+");
        double sum = 0;
        for (String s : str) {
            String temp = s.substring(1, s.length() - 1);
            int number = Integer.parseInt(temp);
            int firstLetter = s.charAt(0);
            int lastLetter = s.charAt(s.length() - 1);
            if (firstLetter > 64 && firstLetter < 91) {
                sum += (number * 1.0) / (firstLetter - 64);
            } else {
                sum += number * (firstLetter - 96);
            }
            if (lastLetter > 64 && lastLetter < 91) {
                sum -= lastLetter - 64;
            } else {
                sum += lastLetter - 96;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
