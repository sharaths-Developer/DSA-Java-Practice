package java_basics;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Write a program to print whether a number is even or odd, also take input from the user.

        int number ;
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("This is even number");
        }else{
            System.out.println("This is odd number");
        }

        sc.close();
    }
}
