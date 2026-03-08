import java.util.Scanner;

public class apssorfail {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();

        String reportcard = Num >= 33 ? "Pass" : "Fail";
        System.out.println(reportcard);
    }
}