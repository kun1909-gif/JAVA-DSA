import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your number :");
        int num = input.nextInt();
        int sum = sumofdigits(num);
        System.out.println("sum of digit is " + sum);


    }

    public static int sumofdigits(int num){
        int sum = 0;
        while (num > 0 ){
            sum += num % 10 ;
            num /= 10;
     
        }
        return sum;
    }
}
