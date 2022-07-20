import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        System.out.println(sum(strings[0], strings[1]));
    }

    public static int sum(String strOne, String strTwo) {
        char[] arrayOne = strOne.toCharArray();
        char[] arrayTwo = strTwo.toCharArray();
        int length, sum = 0;
        length = Math.min(strOne.length(), strTwo.length());
        for (int i = 0; i < length; i++) {
            sum += (int) arrayOne[i] * (int) arrayTwo[i];
        }
        if (arrayOne.length > arrayTwo.length) {
            for (int i = length; i < arrayOne.length; i++) {
                sum += (int) arrayOne[i];
            }
        } else {
            for (int i = length; i < arrayTwo.length; i++) {
                sum += (int) arrayTwo[i];
            }
        }
        return sum;
    }
}
