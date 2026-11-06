package conditional_loops;
import java.util.Scanner;

public class Question19{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//Subtract the product and sum Digits of an Integer

System.out.print("Enter a number: ");
int n = sc.nextInt();
int product = 1;
int sum = 0;

while(n > 0){
int digit = n % 10;

product = product * digit;
sum = sum + digit;

n = n /10;

}

int result = product - sum;

System.out.print(result);

sc.close();

}
}



