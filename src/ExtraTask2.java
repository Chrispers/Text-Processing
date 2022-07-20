import java.util.Scanner;

public class ExtraTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        char charOne = scanner.nextLine().charAt(0);
        char charTwo = scanner.nextLine().charAt(0);
        String random = scanner.nextLine();
        for (int i = 0; i < random.length(); i++) {
            if(charOne > charTwo) {
                if (random.charAt(i) > charTwo && random.charAt(i) < charOne)
                    sum += random.charAt(i);
            }else{
                if (random.charAt(i) > charOne && random.charAt(i) < charTwo)
                    sum += random.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
