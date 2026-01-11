import java.util.Scanner;
public class Main{
    public static  void main(String[] args){
        Scanner er = new Scanner(System.in);
        System.out.println("Enter value for num1 as double: ");
        double num1 = er.nextDouble();
        System.out.println("Enter value for num2 as double: ");
        double num2 = er.nextDouble();
        System.out.println("Enter value for num3 as double: ");
        double num3 = er.nextDouble();
        double avg = (num1+num2+num3)/3;
        System.out.println("Average of 3 given double is : "+avg);

    }
}