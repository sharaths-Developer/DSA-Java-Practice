package conditional_loops;
import java.util.Scanner;

public class Question15{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

//Find the Volume of Sphere

System.out.print("Enter the Radius: ");
double Radius = sc.nextDouble();

double pi = Math.PI;

double Volume = (4.0 / 3) * pi *Radius * Radius * Radius;

System.out.print("Volume of the Sphere is: " + Volume);



sc.close();
}
}
