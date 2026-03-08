import java.util.Scanner;

public class GreatestNo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter is your  number ");
        int first  =  input.nextInt();
         int second =  input.nextInt();
          int third =  input.nextInt();

        if(first >=second && first >=third){
            System.out.println(first+ "is the graestest number ");
        } else if (second >= third ){
            System.out.println(second + "is the  greatest number ");
        }else {
            System.out.println(third +"is the gratest number ");
        }


        
    }
}
