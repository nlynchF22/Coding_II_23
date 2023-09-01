import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spaceIdx;
        String firstNameInitial;
        String lastName;
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        spaceIdx = name.indexOf(" ");
        firstNameInitial = name.substring(0, 1);
        lastName = name.substring(spaceIdx);
        System.out.println(lastName + ", " + firstNameInitial + ".");
        sc.close();
        // your code goes here
    }
}