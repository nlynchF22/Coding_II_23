import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a wavelength in nanometers to show a specific color");
        double chosenNumberInNanoMeters = sc.nextDouble();
        if (380 < chosenNumberInNanoMeters && chosenNumberInNanoMeters < 450) {
            System.out.println("The color you have chosen is Violet");
        } else if (450 < chosenNumberInNanoMeters && chosenNumberInNanoMeters < 495) {
            System.out.println("The color you have chosen is Blue");
        } else if (495 < chosenNumberInNanoMeters && chosenNumberInNanoMeters < 570) {
            System.out.println("The color you have chosen is Green");
        } else if (570 < chosenNumberInNanoMeters && chosenNumberInNanoMeters < 590) {
            System.out.println("The color you have chosen is Yellow");
        } else if (590 < chosenNumberInNanoMeters && chosenNumberInNanoMeters < 620) {
            System.out.println("The color you have chosen is Orange");
        } else if (620 < chosenNumberInNanoMeters && chosenNumberInNanoMeters < 750) {
            System.out.println("The color you have chosen is Red");
        } else {
            System.out.println("The entered wavelength in nanometers is not part of the visivle spectrum");
        }
        sc.close();
    }
}
