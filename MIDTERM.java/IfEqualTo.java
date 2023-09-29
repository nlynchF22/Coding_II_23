import java.util.Scanner;
public class IfEqualTo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number (whole numbers only please)");
        int num1 = sc.nextInt();
        System.out.println("Please enter your second number (whole numbers only please)");
        int num2 = sc.nextInt();
        System.out.println("Please enter your third number (whole numbers only please)");
        int num3 = sc.nextInt();
        System.out.println("Please enter your final number (whole numbers only please)");
        int num4 = sc.nextInt();
        if(num1 == num2 && num1 == num3 && num1 == num4){
            System.out.println("The numbers are equal!");
        }else{
            System.out.println("The numbers are not equal!");
        }
        sc.close();
    }
}
