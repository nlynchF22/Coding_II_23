public class Problem2 {
    public static void main(String[] args) {
        int refusePile = 0;
        int totalNumber = 0;
        for (int i = 1; i < 4_000_000; i++ ) {
            int numA = i;
            int numB;
            if ((numA % 2) == 0 && i < 4_000_000) {
                totalNumber += i;
            } else {
                refusePile += i;
            }
            numB = numA;
        }
        System.out.println(totalNumber);
    }
}
