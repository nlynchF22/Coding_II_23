import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please choose a number");
       int chosenNumber = sc.nextInt();
       System.out.println("The number you have chosen is: " + chosenNumber);
       System.out.println("Now displaying multiples of " + chosenNumber);
       for(int i = 1; i <= 12; i++){
        System.out.println(chosenNumber + " x " + i + " = " + (chosenNumber * i));
       }
       sc.close();
    }

}
