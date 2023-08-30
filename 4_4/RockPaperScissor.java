import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 3: ");
        int userNum = numberScanner.nextInt();
        Random rnd = new Random();
        int computersNum = rnd.nextInt(3) + 1;
        System.out.println("You chose: " + userNum);
        System.out.println("The computer chose: " + computersNum);
        numberScanner.close();

    }
}
