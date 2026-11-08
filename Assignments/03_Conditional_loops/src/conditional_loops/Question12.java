package conditional_loops;
import java.util.Scanner;

public class Question12{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

//Find the Volume of Cone

System.out.print("Enter the Rsdius: ");
double Radius = sc.nextDouble();

System.out.print("Enter the Height: ");
double Height = sc.nextDouble();

double pi = Math.PI;

double Volume = (1.0/3) * pi * ( Radius * Radius ) *  Height;

System.out.print("Volume of Cone is: " + Volume);




sc.close();
}
}
