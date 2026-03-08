import java.util.Scanner;

public interface Biteiseor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int first = input.nextInt();
        System.out.println("eneter the other number ");
        int second = input.nextInt();

        int result = first | second  ; 

        System.out.println("Reslit is " + result);
    }
}
