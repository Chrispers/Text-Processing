import java.util.Scanner;

public class ExtraTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] key = scanner.nextLine().split(" ");
        while(true){
            String message = scanner.nextLine();
            if(message.equals("find"))
                break;
            StringBuilder newMessage = new StringBuilder();
            int temp = 0;
            for (int i = 0; i < message.length(); i++) {
                newMessage.append((char)((int) message.charAt(i) - Integer.parseInt(key[temp])));
                if(temp == key.length - 1){
                    temp = 0;
                }else{
                    temp++;
                }
            }
            String type = newMessage.substring((newMessage.indexOf("&") + 1),
                    newMessage.lastIndexOf("&"));
            String coordinates = newMessage.substring(newMessage.indexOf("<") + 1, newMessage.indexOf(">"));
            System.out.println("Found " + type + " at " + coordinates);
        }
    }
}
