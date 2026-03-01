package Challenge;

import java.util.Scanner;

public class Calperimeter {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the all side ");
    
    int a =  input.nextInt();
    int b = input.nextInt();
     
    System.out.println("  Cal  perimeter of  reactangle " + 2*(a+b));

}
}
