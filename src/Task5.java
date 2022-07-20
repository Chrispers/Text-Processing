import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numOne = scanner.nextLine();
        int numTwo = Integer.parseInt(scanner.nextLine());
        char[] array = numOne.toCharArray();
        StringBuilder newNumber = new StringBuilder();
        int temp = 0;
        for (int i = array.length - 1; i >= 0 ; i--) {
            int tempInt = (array[i] - '0') * numTwo;
            if(temp != 0){
                tempInt += temp;
            }
            if(tempInt < 10){
                newNumber.append(tempInt);
                temp = 0;
            }else{
                if(i == 0){
                    newNumber.append(tempInt % 10);
                    newNumber.append(tempInt / 10);
                }else {
                    newNumber.append(tempInt % 10);
                    temp = tempInt / 10;
                }
            }
        }
        if(numTwo == 0)
            System.out.println(0);
        else
            System.out.println(newNumber.reverse());
    }
}