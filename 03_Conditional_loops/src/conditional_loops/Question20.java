package conditional_loops;
import java.util.Scanner;

public class Question20{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//Find the factors of all Numbers

System.out.print("Enter a number: ");
int number = sc.nextInt();

for(int i =1 ;i <= number; i++){
	if(number % i == 0)
	System.out.println(i);
}


sc.close();
}
}
