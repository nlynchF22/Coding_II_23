import java.util.Scanner;
public class TrafficLightChecker {

    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a color code");
      int currentTraficLightNumber = sc.nextInt();
      if (currentTraficLightNumber == 1) {
        System.out.println("The next traffic light color is green");
      } else if (currentTraficLightNumber == 2) {
        System.out.println("The next tracffic light color is yellow");
      } else if (currentTraficLightNumber == 3) {
        System.out.println("The next traffic light color is red");
      } else {
        System.out.println("Invalid color");
      }
      sc.close();
    }

}
