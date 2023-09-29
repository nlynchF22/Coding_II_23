import java.util.Scanner;
public class InchesToMeters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number in inches that you would like to convert to meters");
        double inch = sc.nextInt();
        double meters = inch * 0.0254;
        System.out.println(inch + " inches in meters is: " + meters + " meters");
        sc.close();
    }
}
