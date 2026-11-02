package java_basics;


public class Question07 {
    public static void main(String[] args) {

        int num = 123545;

        int count = 0;

        while(num > 0){
            int temp = num % 10;
            if(temp == 5){
                count++;
            }
            num = num / 10;
        }


        System.out.println(count);
    }
}