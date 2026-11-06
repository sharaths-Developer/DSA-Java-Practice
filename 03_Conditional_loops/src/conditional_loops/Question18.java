package conditional_loops;
import java.util.Scanner;

public class Question18{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//find the total Surface Area of cube
System.out.print("Enter the lenght: ");
double Lenght = sc.nextDouble();

double Surface_area = 6 * (Lenght * Lenght);

System.out.print("Total Surface Area of the Cube is: " + Surface_area);
sc.close();
}
}
