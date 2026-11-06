package conditional_loops;
import java.util.Scanner;

public class Question13{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

//Find the Volume of Prism

System.out.print("Enter the Base: ");
double Base = sc.nextDouble();

System.out.print("Enter the Height: ");
double Height = sc.nextDouble();

System.out.print("Enter the Lenght: ");
double Lenght = sc.nextDouble();

double Volume = (1.0/2) * Base * Height * Lenght;

System.out.print("Volime of the Prims is: " + Volume);



sc.close();
}
}
