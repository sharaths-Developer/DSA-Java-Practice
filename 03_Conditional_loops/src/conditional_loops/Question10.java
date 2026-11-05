package conditional_loops;
import java.util.Scanner;

public class Question10{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

//Find the Primeter of the Square

System.out.print("Enter the side: ");
double Side = sc.nextInt();

double Primeter = 4 * Side;

System.out.print("Primeter of the side is: " + Primeter);



sc.close();

}

}
