import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner er = new Scanner(System.in);
        int totalMinutes = er.nextInt();
        System.out.print("Enter time in minutes ");
        int hours = totalMinutes/60;
        int minutes = totalMinutes % 60;
        System.out.print(hours +" Hours" + minutes+" Minutes");
    }
}
