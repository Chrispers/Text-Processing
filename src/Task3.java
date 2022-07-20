import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        System.out.println("File name: " + getFileName(filePath));
        System.out.println("File extension: " + getFileExtension(filePath));
    }

    public static String getFileName(String filePath){
        int begin = filePath.lastIndexOf('\\');
        int end = filePath.lastIndexOf('.');
        return filePath.substring(begin + 1, end);
    }

    public static String getFileExtension(String filePath){
        int begin = filePath.lastIndexOf('.');
        return filePath.substring(begin + 1);
    }
}
