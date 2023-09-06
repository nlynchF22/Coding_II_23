import java.util.Scanner;
public class ComputeFare {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age");
        int age = sc.nextInt();
        int fare;
        if (age < 11) {
            fare = 3;
            System.out.println("Your fare for your age would be: $" + fare);
        } else if (age < 65) {
            fare = 5;
            System.out.println("Your fare for your age would be: $" + fare);
        } else {
            fare = 3;
            System.out.println("Your fare for your age would be: $" + fare);
        }
        sc.close();
    }
}
