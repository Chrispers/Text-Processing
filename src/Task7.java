import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        int strength = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '>' && i + 1 < str.length()){
                strength = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
            }
            while(strength > 0 && i + 1 < str.length()){
                if(str.charAt(i + 1) != '>'){
                    str.deleteCharAt(i + 1);
                    strength--;
                }else{
                    i++;
                    strength += Integer.parseInt(String.valueOf(str.charAt(i + 1)));
                }
            }
        }
        System.out.println(str);
    }
}
