package Flow_of_Program;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        //Take two numbers and print the sum of both.
        int num1;
        System.out.print("Enter number 1: ");
        num1 =sc.nextInt();
        int num2;
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();


        int sum = num1 + num2;

        System.out.print("Sum of two numbwe is : " +sum );
        sc.close();
    }
}
