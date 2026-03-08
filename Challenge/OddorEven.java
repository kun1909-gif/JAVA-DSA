import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker ");
        System.out.println("Eneter the your Number ");
         int num = input.nextInt();


         if (num%2 == 0  ){
            System.out.println("your number is an even Number ");
} else {
    System.out.println("your number is a odd number ");
}



    }
}
