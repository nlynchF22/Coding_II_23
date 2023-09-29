import java.util.Scanner;
public class MultipleOf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number that you would like to see the multiples of up to 10 of (whole numbers only)");
        int number = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int multipliedNum = number * i;
            System.out.println(number + " x " + i + " = " + multipliedNum);
        }
        sc.close();
    }
}
