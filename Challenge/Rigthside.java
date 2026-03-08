import java.util.Scanner;

public class Rigthside {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number ");

        int num = input.nextInt();

        int result = num << 6;
        System.out.println("Result is " + result);
    }
}
