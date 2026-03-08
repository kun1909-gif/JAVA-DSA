import java.util.Scanner;

public class multiplication {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("welcome th multiplicatoion table ");

        System.out.println("Enter the numbe");
        int Num = input.nextInt();

        for (int i =1; i<= 10; i++ ){
            System.out.println(Num + " X " + i + " = " + (Num * i));
        }

        




    }
}
