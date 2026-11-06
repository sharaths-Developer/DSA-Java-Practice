package conditional_loops;
import java.util.Scanner;

public class Question17{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//Addition of two numbers

System.out.print("Enter number 1: ");
int num1 = sc.nextInt();

System.out.print("Enter number 2: ");
int num2 = sc.nextInt();

int result = num1 + num2;

System.out.print("Addition of two numbers is: " + result);

sc.close();
}
}
