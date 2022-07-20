import java.util.Scanner;

public class ExtraTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        System.out.println("<h1>\n" + "     " + title + "\n</h1>");
        String content = scanner.nextLine();
        System.out.println("<article>\n" + "     " + content + "\n</article>");
        while(true){
            String comment = scanner.nextLine();
            if(comment.equals("end of comments"))
                break;
            System.out.println("<div>\n" + "     " + comment + "\n</div>");
        }
    }
}
