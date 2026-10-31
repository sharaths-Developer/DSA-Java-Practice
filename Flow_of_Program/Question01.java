package Flow_of_Program;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        //Input a year and find whether it is a leap year or not.

        int year ;
        System.out.print("Enter your birth year: ");
        year = sc.nextInt();

        if(year % 400 == 0){ 
            System.out.print("This is a yeap year");
        }else if(year % 100 == 0){ 
            System.out.print("This is not a leap year");
        }else if(year % 4 == 0){ 
            System.out.print("This is a leap year");
        }else{ 
            System.out.print("This is not a leap year");
        }
        sc.close();
    }
}
