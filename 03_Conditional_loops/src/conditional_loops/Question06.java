package conditional_loops;
import java.util.Scanner;

public class Question06 {
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the Radius: ");
	double Radius = sc.nextDouble();

	double pi = Math.PI;

	double Primeter = 2 * pi * Radius ;

	System.out.print("Primeter os Circle is: " + Primeter);

	sc.close();

    }
}


