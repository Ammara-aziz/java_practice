import java.util.Scanner;
public class Prac {
    public static void main(String[] args){
        /*for(int i = 1; i <= 5; i++){

            for(int j = 1; j <= i; j++){
                System.out.println(j);
                System.out.println("*");
            }
            System.out.println("*");
        }*/
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        for (int i=0; i<size; i++){
            marks[i] = sc.nextInt();
        System.out.print(marks);
        /*for (int i = n; i > 2; i--) arr[i] = arr[i-1];
            arr[2] = 99;
        for (int k = 2; k < n-1; i++) arr[i] = arr[i+1];n--;  // new size*/
        }
    }
}
