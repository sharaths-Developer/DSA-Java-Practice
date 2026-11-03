package conditional_loops;
import java.util.Scanner;


public class Question01 {
    public static void main(String[] args){ 

        Scanner sc = new Scanner(System.in);
        // 1. Find the  Area of Circle

        //formula to find are of the circle
        //A=π×r2

        double radius ;

        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();

        double pi = Math.PI;

        double Area = pi * radius * radius;

        System.out.print("Area of the Circle is: " + Area);
        
        sc.close();

    }
}
