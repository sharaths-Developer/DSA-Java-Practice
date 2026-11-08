package conditional_loops;
import java.util.Scanner;

public class Quesion02{ 
    public static void main(String[] args){ 

        Scanner sc = new Scanner(System.in);

        //2.  Find the Area of Triangle.
        //the formula is : A=21​×b×h

        double Base ;

        System.out.print("Enter the Base: ");
        Base = sc.nextDouble();

        double Height ;
        System.out.print("Enter the Height: ");
        Height = sc.nextDouble();

        double Area = 1.0/2 * ( Base * Height);

        System.out.print("Area of the Triangle is: " + Area);


        sc.close();
    }
}