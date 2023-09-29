import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int setPin = 6452;
        System.out.print("Please enter your pin: ");
        int userPin = sc.nextInt();
        while(userPin != setPin){
            System.out.print("That is the incorrect pin please try again: ");
            userPin = sc.nextInt();
        }
        System.out.println("Welcome to your account");
        sc.close();
    }
}
