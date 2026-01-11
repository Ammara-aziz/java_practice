import java.util.Scanner;
public class Array {
    static void array( Scanner sc){

        int size = sc.nextInt();
        System.out.print(size);
        int[] marks = new int[size];// create marks array
        for (int i = 0; i<size; i++){
            marks[i] = sc.nextInt();
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        array(sc);
    }
}
