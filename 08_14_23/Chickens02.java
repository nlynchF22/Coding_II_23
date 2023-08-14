public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        final double MONDAY = 100;
        final double TUESDAY = 121;
        final double WEDNESDAY = 117;
        double dailyAverage = (MONDAY + TUESDAY + WEDNESDAY)/3;
        double monthlyAverage = dailyAverage*30;
        double monthlyProfit = monthlyAverage*0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
