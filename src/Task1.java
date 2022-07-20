import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(", ");
        for (String name : names) {
            if (checkLength(name) && checkCharacters(name))
                System.out.println(name);
        }
    }

    public static boolean checkLength(String name){
        return name.length() >= 3 && name.length() <= 16;
    }

    public static boolean checkCharacters(String name){
        char[] characters = name.toCharArray();
        for (char character : characters) {
            if (!Character.isLetterOrDigit(character) &&
                    character != '-' && character != '_')
                return false;
        }
        return true;
    }
}