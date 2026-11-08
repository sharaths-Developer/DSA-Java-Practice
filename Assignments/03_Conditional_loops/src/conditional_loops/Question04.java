package conditional_loops;
import java.util.Scanner;

public class Question04 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);

        //5. Find the Area of Parallelogram
        //the formula is: A=b×h

        System.out.print("Enter the Base: ");
        double  Base = sc.nextDouble();

        System.out.print("Enter the Height: ");
        double Height = sc.nextDouble();

        double Area = Base * Height ;

        System.out.print("Area of the Parallelogram: " + Area);


        sc.close();
    }
}
