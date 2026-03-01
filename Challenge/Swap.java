package Challenge;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("eneter value of A : ");
    int a = input.nextInt();
    System.out.println("enter Value of B :");
    int b = input.nextInt();

    int c= a;
    a=b;
    b=c;

    System.out.println("swapping ");
    System.out.println("value of A is :" + a);
    System.out.println("value of B is : " + b);

    }
}
