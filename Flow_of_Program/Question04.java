package Flow_of_Program;
import java.util.Scanner;

public class Question04 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        //Take 2 numbers as inputs and find their HCF and LCM.

        //finding HCF 
        int num1 ;
        System.out.print("Enter a number: ");
        num1 = sc.nextInt();
        int num2 ;
        System.out.print("Enter a number: ");
        num2 = sc.nextInt();
        int hcf = 1;

        for(int i = 1; i<= num1; i++){ 
            if(num1 % i == 0 && num2 % i == 0 ){ 
                // System.out.print(i + " ");
                hcf = i;
            }
        }

        //findiing LCM
        int lcm1 ;
        System.out.print("Enter number to get lcm : ");
        lcm1 = sc.nextInt();
        int lcm2 ;
        System.out.print("Enter number to get lcm: ");
        lcm2 = sc.nextInt();
        int lcm = 0;

        for(int i=20; ; i++){ 
            if(i % lcm1 ==0 && i %lcm2 == 0){ 
                lcm = i;
                break;
            }
        }
        
        System.out.println( "HCF = " + hcf);


        System.out.println("LCM = "+lcm);

        

        sc.close();

        
    }
}
