import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = "Moe";
        System.out.println("Please enter your name");
        String userName = sc.nextLine();
        boolean compare = name.equalsIgnoreCase(userName);
        if (compare) {
            System.out.println("You are the king of rock and roll");
        } else{
            System.out.println("You are not the king");
        }
        sc.close();
   }
    
}

