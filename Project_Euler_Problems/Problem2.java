public class Problem2 {
    public static void main(String[] args) {
        int refusePile = 0;
        int totalNumber = 0;
        int numA = 1;
        int numB = 1;
        int numC = numA + numB;
        while(numC < 4_000_000) {
            if ((numC % 2) == 0) {
                totalNumber += numC;
            }
            numA = numB;
            numB = numC;
            numC = numA + numB;
        }
        System.out.println(totalNumber);
    }
}