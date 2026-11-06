package conditional_loops;
import java.util.Scanner;

public class Question21{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//Sum of number until Zero

int sum = 0;

while(true){

System.out.print("Enter number: ");
int number = sc.nextInt();

sum = sum + number;
System.out.println(sum);

if(number == 0){ 
	break;
}
	
}

System.out.println(sum);

sc.close();

}
}
