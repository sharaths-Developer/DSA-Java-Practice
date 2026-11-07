
package conditional_loops;
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Find the largest number until user enters 0

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int largest = number;

        while (number != 0) {

            if (number > largest) {
                largest = number;
            }

            System.out.print("Enter number: ");
            number = sc.nextInt();
        }

        System.out.println("Largest number: " + largest);

        sc.close();
    
}
}