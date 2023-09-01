import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println("Your number is a even number");
        } else{
            System.out.println("Your number is a odd number");
        }
        sc.close();
    }
}
