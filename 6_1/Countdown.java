public class Countdown {

    public static void main(String[] args) {
        
        System.out.println("Countdown to Launch: ");

        for(int i = 20; i >= 0; i--) {
            System.out.print(i +" ");
            if (i%2 == 0){
                System.out.print("\n" + i + "\n");
            } 
        }

        System.out.println("Blast Off!");
    }
}
