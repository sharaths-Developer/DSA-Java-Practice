package conditional_loops;
import java.util.Scanner;

public class Question07{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	//2. Find the Primeter of Equilateral Triangle

	System.out.print("Enter the Side: ");
	double Side = sc.nextDouble();

	double Primeter = 3 * Side ;

	System.out.print("Primeter of Equilateral Triangle is: " + Primeter);

	sc.close();


}

}
