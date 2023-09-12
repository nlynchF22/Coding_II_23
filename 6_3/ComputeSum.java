import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        for(int i = 10; i > 0; i--){
            System.out.println("Please enter " + i + " numbers, enter 0 to exit");
            number = sc.nextInt();
            if(number == 0)
                break;
            sum += number;
        }
        System.out.println("Your sum is: " + sum);
        sc.close();
    }
}
