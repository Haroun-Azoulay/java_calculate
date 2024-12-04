package java_calculate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Calculate");
        Scanner myObj = new Scanner(System.in);

        String userName = "";
        
        while (true) {
            System.out.println("Enter your username:");
            userName = myObj.nextLine();

            if (!userName.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Username cannot be empty. Please try again!");
            }
        }

        System.out.println("Welcome " + userName + "!");
        
        myObj.close();
    }
}
