package Challenge;
import java.util.Scanner;

public class AddNO{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter the first Number");
        int Num1 = input.nextInt();
        System.out.print("Enter the Second Number");
        int Num2 = input.nextInt();
        System.out.println(" sum of two number  " + Num1 +" and " + Num2+ "=" + (Num1+Num2));

    }
}