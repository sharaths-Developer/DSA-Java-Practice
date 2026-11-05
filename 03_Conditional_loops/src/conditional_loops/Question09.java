package conditional_loops;
import java.util.Scanner;

public class Question09{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

//Find the Primeter of Rectangle;

System.out.print("Enter the Lenght: ");
double Lenght = sc.nextDouble();

System.out.print("Enter the Bridth: ");
double Breadth = sc.nextDouble();

double Primeter = 2 * (Lenght + Breadth);

System.out.print("Primeter of the Rectangle is: " + Primeter);



sc.close();

}

}
