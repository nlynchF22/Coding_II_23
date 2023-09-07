public class Problem2 {
    public static void main(String[] args) {
        int refusePile = 0;
        int totalNumber = 0;
        for (int i = 1; i < 4_000_000; ) {
            int numA = 1;
            int numB = 2;
            if (i == 1 && i < 4_000_000) {
                totalNumber += i;
            } else {
                refusePile += i;
            }
        }
    }
}
