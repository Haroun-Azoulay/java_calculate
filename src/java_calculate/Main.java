package java_calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Calculate");
        Scanner myObj = new Scanner(System.in);

        String userName = "";
        String calculateSymbol = "";

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

        System.out.print("Can you enter first number: ");
        int a = myObj.nextInt();

        System.out.print("Can you enter second number: ");
        int b = myObj.nextInt();

        myObj.nextLine();
        

        System.out.println("Enter symbol to multiply (*), divide (/), or addition (+):");

        while (true) {
            calculateSymbol = myObj.nextLine().trim();

            if (!calculateSymbol.isEmpty() &&
                (calculateSymbol.equals("*") || calculateSymbol.equals("/") || calculateSymbol.equals("+"))) {
                break;
            } else {
                System.out.println("Invalid input. Please enter *, /, or +:");
            }
        }


        if (calculateSymbol.equals("/") && b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int result = myCalcule(a, b, calculateSymbol);
            System.out.println("The result is: " + result);
        }

        myObj.close();
    }

    static int myCalcule(int a, int b, String calculateSymbol) {
        int responseTotal = 0;
        switch (calculateSymbol) {
            case "*":
                responseTotal = (a * b);
                break;
            case "/":
                responseTotal = (a / b);
                break;
            case "+":
                responseTotal = (a + b);
                break;
            default:
                System.out.println("Invalid operation.");
        }
        return responseTotal;
    }
}

