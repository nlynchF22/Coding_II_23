import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[5];
        System.out.println("Please enter the scores of 5 students");
        double sum = 0.0;
        double avg = 0.0;
        for(int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextDouble();
        }
        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            avg = sum / scores.length;
        }
        System.out.println("The average score of the class: " + avg);
        sc.close();
    }

}
