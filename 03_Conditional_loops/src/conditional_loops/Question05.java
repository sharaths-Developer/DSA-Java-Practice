package conditional_loops;
import java.util.Scanner;

public class Question05 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);

        //4. Find the Area of Isosceles Triangle
        //this formula is: A=4b​×4a2−b2


        System.out.print("Enter First number: ");
        double a = sc.nextDouble();

        System.out.print("Enter Second number: ");
        double b = sc.nextDouble();

        double Area = b/4.0 *  Math.sqrt( 4 * (a * a) - (b * b));

        System.out.print("Area of the Isosceles Triangle: " + Area);

        sc.close();

        //Dude, you might be wondering why I'm using variable names like `a` and `b`. Honestly, I don't really know what the appropriate variable names should be, so I just used `a` and `b` while writing the code. If anyone knows better variable names for this, please feel free to suggest me!.

    }
}
