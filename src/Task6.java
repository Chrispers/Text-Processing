import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        for (int i = 0; i < sb.length() - 1; i++) {
            while(sb.charAt(i) == sb.charAt(i + 1) && i + 1 < sb.length() - 1){
                sb.deleteCharAt(i + 1);
            }
        }
        if(sb.charAt(sb.length() - 1) == sb.charAt(sb.length() - 2))
            sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
