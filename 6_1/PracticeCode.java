/*import java.util.Scanner;
public class PracticeCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        System.out.println("This program will find the minimum of " + N + " numbers.");
        System.out.println("Enter the first number:");
        int minimum = sc.nextInt();
        for(int i = 0; i < N-1; i++){
            System.out.println("Enter the next number: ");
            int value = sc.nextInt();
            if(value < minimum)
                minimum = value;
        }//end for
        System.out.println("The minimum value is " + minimum + ".");
        sc.close();
    }//end method main
}*/
import java.util.Scanner;
public class PracticeCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = 5;
        System.out.println("This program checks 5 sets of numbers to see " +
        " if one number is evenly divisible by another.");

        for(int i = 0; i < N-1; i++){
            System.out.println("Enter a number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the divisor: ");
            int num2 = sc.nextInt();
            if(num1%num2 == 0)
                System.out.println(num1 + " is divisible by " + num2);
            else
                System.out.println(num1 + " is not divisible by " + num2);
        }//end for
        sc.close();
    } //end main method
} //end class