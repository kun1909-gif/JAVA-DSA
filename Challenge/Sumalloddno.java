import java.util.Scanner;

public class Sumalloddno{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the your Number");
        int Num = input.nextInt();
        int sum = oddSum(Num); 
        System.out.println("Oddsum till "  + Num + "is :" + sum  );


    }

    public static int oddSum(int Num) {
        int sum = 0 ;
        int i=1;
        while (i <= Num ){
            sum += i;
            i +=2;

        }
        return sum ;

    } 
}