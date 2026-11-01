package java_basics;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Take name as input and print a greeting message for that particular name.

        String name ;
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Happy Birthday " + name);

        sc.close();
    }
}
