package java_basics;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        int result = 0;

        int num1 ;
        System.out.print("Enter a number: ");
        num1 = sc.nextInt();

        int num2 ;
        System.out.print("Enter a number: ");
        num2 = sc.nextInt();

        char operations ;
        System.out.print("Enter Operation: ");
        operations = sc.next().charAt(0);

        if(operations=='+'){
            result = num1 + num2 ;
        }else if(operations=='-'){
            result = num1 - num2 ;
        }else if(operations=='*'){
            result = num1 * num2 ;
        }else if(operations=='/'){
            result = num1 / num2 ;
        }else {
            System.out.println("Invalid Operation");
            System.out.println("Thankyou");
        }

        System.out.println(result);

        sc.close();
    }
}
