package conditional_loops;
import java.util.Scanner;

public class Question08{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

	//3. find the Perimeter of Parallelogram

	System.out.print("Enter the lenght: ");
	double Lenght = sc.nextDouble();

	System.out.print("Enter the Breadth: ");
	double Breadth = sc.nextDouble();

	double Primeter = 2 * (Lenght + Breadth);

System.out.print("The Primeter of Parallelogram is: " + Primeter);



sc.close();


}

}
