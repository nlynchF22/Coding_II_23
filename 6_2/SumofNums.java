import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (-1 to quit): ");
        int number = sc.nextInt();

        do{
            sum += number;
            System.out.println("Please enter a number (-1 to quit): ");
            number = sc.nextInt();
        }while(number != -1);

/*
        while (number != -1) {
            sum = sum + number;     // moved to top of loop
            System.out.print("Enter a number (-1 to quit): ");
            number = sc.nextInt();
        }
*/

        System.out.println("The sum is " + sum);
        sc.close();
    }
}
