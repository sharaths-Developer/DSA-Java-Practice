package conditional_loops;
import java.util.Scanner;

public class Question14{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

//Find the Volume of Cylender

System.out.print("Enter the Radius: ");
double Radius = sc.nextDouble();

System.out.print("Enter the Height: ");
double Height = sc.nextDouble();

double pi = Math.PI;

double Volume = pi * Radius * Radius * Height;

System.out.print("Volume of the Cylender is: " + Volume);




sc.close();
}
}
