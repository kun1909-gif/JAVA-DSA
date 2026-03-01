package Challenge;

import java.util.Scanner;

public class Arithmetic {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Fisrt number  ");
    int a = input.nextInt();
    System.out.println("Enter the second number ");
    int b = input.nextInt();

    System.out.println("Result");
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);



}
}
