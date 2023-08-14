public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int chickenCount = 8;
        int totalEggs = 0;
        int eggsPerChicken = 4;
        //Mpnday
        totalEggs += eggsPerChicken*chickenCount;
        //Tuesday
        chickenCount++;
        totalEggs += eggsPerChicken*chickenCount;
        //Wednesday
        chickenCount = chickenCount/2;
        totalEggs += eggsPerChicken*chickenCount;

        System.out.println(totalEggs);
    }   
}
