import java.util.Scanner;

public class NoDetermines {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to Number Checker");
    System.out.println("please enter your Number ");
    int num = input.nextInt();

    if(num > 0 ){
        System.out.println("your number is positive");
    }else if (num ==0 ){
        System.out.println("your number is zero");
}else{
System.out.println("your number is Negative");
}

}
}
