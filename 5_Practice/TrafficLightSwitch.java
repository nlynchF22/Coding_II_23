import java.util.Scanner;
public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a color code");
      int currentTraficLightNumber = sc.nextInt();
      switch(currentTraficLightNumber){
        case 1:  System.out.println("The next traffic light color is green");
        break;
        case 2: System.out.println("The next tracffic light color is yellow");
        break;
        case 3:  System.out.println("The next traffic light color is red");
        break;
        default: System.out.println("Invalid color");
      }
      sc.close();
       
    }

}
