
import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your body weight (in pounds)");
            double bodyWeight = sc.nextDouble();
            System.out.println("Please enter your height (in inches)");
            double height = sc.nextDouble();
            double BMI = (bodyWeight/(height*height) *703);
            System.out.println(Math.round(BMI));
            sc.close();
        }
}
