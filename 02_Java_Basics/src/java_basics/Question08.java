package java_basics;
import java.util.Scanner;

public class Question08 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);

        //To calculate Fibonacci Series up to n numbers.

        int n ;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int a =0;
        int b =1;
        int c = a + b;  //this is just to understand how th Fibonacci series

        for(int i = 2; i< n ; i++){ 
            c = a + b;//0 + 1 = 1 , 1 + 1 = 2 , 
            System.out.println(c);

            a = b;// = 1 , 
            b = c;// = 1 ,
        }

        sc.close();

    }
}
