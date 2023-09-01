import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int userAge = sc.nextInt();
        boolean drivingUnderAge = userAge <= 18;
        System.out.println(drivingUnderAge);
        sc.close();

       
    }
}
