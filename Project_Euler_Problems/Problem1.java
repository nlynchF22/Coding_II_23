public class Problem1 {
    public static void main(String[] args){
        int multipleOfThree = 0;
        int multipleOfFive = 0;
        int refusePile = 0;
        int totalNumber = 0;
        for (int i = 0; i < 1_000; i++) {
            if ((i%3) == 0 || (i%5) == 0) {
                multipleOfThree += i;
                multipleOfFive += i;
                totalNumber += i;
            } else {
                refusePile += i;
            }
        }
        System.out.println(totalNumber);
        System.out.println(multipleOfThree);
        System.out.println(multipleOfFive);
        System.out.println("This is the reufuse: " + refusePile);
    }
}
