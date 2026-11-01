package flow_of_program;
import java.util.Scanner;

public class Question05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        String user ;
        int sum = 0;
        while(true){
            //takiing input from user
            System.out.print("Enter number : ");
            user = sc.next();
            //comparing
            if(user.equals("x")){
                break;
            }
            //adding the total variable called sum
            int number = Integer.parseInt(user);
            //converting a string into number
            sum = sum + number;
        }
        System.out.print(sum);


        sc.close();

    }
}