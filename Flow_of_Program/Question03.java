package Flow_of_Program;
import java.util.Scanner;

public class Question03 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        //Take a number as input and print the multiplication table for it.

        int number ;
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for(int i = 1 ; i <= 10; i++){ 
            System.out.println(number + " * " + i + " = " + number * i);
        }
        sc.close();
    }
}
