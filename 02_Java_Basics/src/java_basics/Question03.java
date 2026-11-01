package java_basics;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        double principal ;
        System.out.print("Enter Principal: ");
        principal = sc.nextDouble();

        double time ;
        System.out.print("Enter Time: ");
        time = sc.nextDouble();

        double rate ;
        System.out.print("Enter Salary: ");
        rate = sc.nextDouble();

        double simple_intrest = ( principal * time * rate ) / 100;

        System.out.print("Simple Intrest is : " +  simple_intrest);

        sc.close();
    }
}
