import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);

        System.out.println("enter a positive integer : ");
        int mark = sc.nextInt();

        System.out.println("The mark is : " + mark);

        if (mark >= 50){
            System.out.println(" FAIL");
        } else {
            System.out.println("DONE");
        }

    }
}
