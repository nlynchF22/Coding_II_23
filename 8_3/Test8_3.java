import java.util.Scanner;
public class Test8_3 {
    public static void main(String args[]) {
        int /*a = 100,*/ res;
        try{
            System.out.println("Enter the value for b");
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            System.out.println("Enter the value for c");
            int c = sc.nextInt();
            res = 10 / (b - c);
            System.out.println("The result is " + res);
            sc.close();
        }
        catch(Exception e){
            String errMsg = e.getMessage();
            System.out.println(errMsg);
        }//end try catch
         System.out.println("After catch block");
    }//end method
}
