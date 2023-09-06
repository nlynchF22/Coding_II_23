import java.util.Scanner;
public class SwitchEx1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give us the number of the month you would like us to display");
        int monthNumber = sc.nextInt();
        switch (monthNumber) {
            case 1: System.out.println("The month you have listed is: January");
            break;
            case 2: System.out.println("The month you have listed is: Febuary");
            break;
            case 3: System.out.println("The month you have listed is: March");
            break;
            case 4: System.out.println("The month you have listed is: April");
            break;
            case 5: System.out.println("The month you have listed is: May");
            break;
            case 6: System.out.println("The month you have listed is: June");
            break;
            case 7: System.out.println("The month you have listed is: July");
            break;
            case 8: System.out.println("The month you have listed is: August");
            break;
            case 9: System.out.println("The month you have listed is: September");
            break;
            case 10: System.out.println("The month you have listed is: October");
            break;
            case 11: System.out.println("The month you have listed is: November");
            break;
            case 12: System.out.println("The month you have listed is: December");
            break;
            default: System.out.println("Invalid");
        }
    sc.close();
    }
}
