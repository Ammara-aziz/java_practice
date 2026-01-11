import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int greatest, middle, smallest;

        Scanner er = new Scanner(System.in);

        System.out.print("Enter 1st: ");
        int a = er.nextInt();

        System.out.print("Enter 2nd: ");
        int b = er.nextInt();

        System.out.print("Enter 3rd: ");
        int c = er.nextInt();

        if (a >= b && a >= c) {
            greatest = a;
            if (b >= c) {
                middle = b;
                smallest = c;
            } else {
                middle = c;
                smallest = b;
            }
        }
        else if (b >= a && b >= c) {
            greatest = b;
            if (a >= c) {
                middle = a;
                smallest = c;
            } else {
                middle = c;
                smallest = a;
            }
        }
        else {
            greatest = c;
            if (a >= b) {
                middle = a;
                smallest = b;
            } else {
                middle = b;
                smallest = a;
            }
        }

        System.out.println("Greatest: " + greatest);
        System.out.println("Middle: " + middle);
        System.out.println("Smallest: " + smallest);
    }
}
