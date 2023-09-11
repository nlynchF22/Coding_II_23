import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[]){
        System.out.print("Type a non-negative integer: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number <= 0) {
            System.out.println("Invalid number try again: ");
            int newNumber = sc.nextInt(); number = newNumber;
        }
        System.out.println(Math.sqrt(number));
        sc.close();
    }    
}
