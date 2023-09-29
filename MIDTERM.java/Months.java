import java.util.Scanner;
public class Months {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int leapYearDays = 0;
        System.out.println("Please give us the number of the month you would like us to display");
        int monthNumber = sc.nextInt();
        System.out.println("Please give us the number of the year you would like us to display the month in");
        int yearNumber = sc.nextInt();
        if(yearNumber % 4 == 0){
            leapYearDays = 29;
        }else{
            leapYearDays = 28;
        }
        switch (monthNumber) {
            case 1: System.out.println("The month you have listed is: January in the year " + yearNumber + " and it has 31 days" );
            break;
            case 2: System.out.println("The month you have listed is: Febuary in the year " + yearNumber + " and it has " + leapYearDays);
            break;
            case 3: System.out.println("The month you have listed is: March in the year " + yearNumber + " and it has 31");
            break;
            case 4: System.out.println("The month you have listed is: April in the year " + yearNumber + " and it has 30");
            break;
            case 5: System.out.println("The month you have listed is: May in the year " + yearNumber + " and it has 31");
            break;
            case 6: System.out.println("The month you have listed is: June in the year " + yearNumber + " and it has 30");
            break;
            case 7: System.out.println("The month you have listed is: July in the year " + yearNumber + " and it has 31");
            break;
            case 8: System.out.println("The month you have listed is: August in the year " + yearNumber + " and it has 31");
            break;
            case 9: System.out.println("The month you have listed is: September in the year " + yearNumber + " and it has 30");
            break;
            case 10: System.out.println("The month you have listed is: October in the year " + yearNumber + " and it has 31");
            break;
            case 11: System.out.println("The month you have listed is: November in the year " + yearNumber + " and it has 30");
            break;
            case 12: System.out.println("The month you have listed is: December in the year " + yearNumber + " and it has 31");
            break;
            default: System.out.println("Invalid");
        }
    sc.close();
    }
}
