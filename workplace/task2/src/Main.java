import  java.util.Scanner;  // Import Scanner class to take input from user

public class Main{
    public static void main(String[] args){
        // Create Scanner object (scn) to read input from user
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 1st Number: ") ; // Read (get) first number
        int num1 = scn.nextInt();
        System.out.print("Enter 2nd Number: ") ;
        int num2 = scn.nextInt();
        int sum = num1 + num2;
        System.out.println("sum "+ sum);
        int subtract = num1 - num2;
        System.out.println("Difference"+ subtract);
        int product = num1 * num2;
        System.out.println("Product "+ product);
        int remainder = num1 % num2;
        System.out.println("quotient"+remainder);
        int quotient = num1 / num2;
        System.out.print("remainder"+quotient);
    }
}
