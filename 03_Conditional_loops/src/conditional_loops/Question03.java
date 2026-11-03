package conditional_loops;
import java.util.Scanner;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);

        //3: Find the  Area of Rectangle.
        //the formula is: A=l×w

        double Lenght ;

        System.out.print("Enter the lenght: ");
        Lenght = sc.nextDouble();

        System.out.print("Enter the Width: ");
        double Widht = sc.nextDouble();

        double Area = Lenght * Widht;

        System.out.print("Area of the Rectangle is: " + Area);    

        sc.close();
    }
}
