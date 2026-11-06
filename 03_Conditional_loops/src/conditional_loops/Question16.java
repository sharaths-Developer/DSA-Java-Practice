package conditional_loops;
import java.util.Scanner;

public class Question16{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

//Find the Volume of the Pyramid

System.out.print("Enter the Base Side: ");
double a = sc.nextDouble();

System.out.print("Enter the Height: ");
double Height = sc.nextDouble();

double Volume = (1.0 / 3) * a * a  * Height;

System.out.print("Volume of the Pyamid is: " + Volume);




sc.close();
}
}
