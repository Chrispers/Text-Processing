import java.util.Scanner;

public class ExtraTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
                "O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] text = scanner.nextLine().split("\\|");
        for (String s : text) {
            String[] word = s.split(" ");
            for (String letter : word) {
                for (int k = 0; k < morseCode.length; k++) {
                    if (morseCode[k].equals(letter)) {
                        System.out.print(letters[k]);
                        break;
                    }
                }
            }
            System.out.print(" ");
        }
    }
}
