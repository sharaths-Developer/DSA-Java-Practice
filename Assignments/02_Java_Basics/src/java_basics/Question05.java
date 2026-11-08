package java_basics;
import java.util.Scanner;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take 2 numbers as input and print the largest number.

        int num1 ;
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();

        int num2 ;
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.print("First Number > Second Number");
        }else {
            System.out.print("Second Number > First Number");
        }

        sc.close();

    }
}
