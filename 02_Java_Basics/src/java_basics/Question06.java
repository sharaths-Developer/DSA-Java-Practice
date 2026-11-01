package java_basics;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Input currency in rupees and output in USD.

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        System.out.print("Enter exchange rate (INR per 1 USD): ");
        double rate = sc.nextDouble();

        double usd = inr / rate;

        System.out.printf("%.2f INR = %.2f USD%n", inr, usd);


        sc.close();

    }
}
