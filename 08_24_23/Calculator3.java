public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    public String name = "";
    
    public void findTotal(double price, String name){
        double total = price*(1+tax+tip);
        System.out.println(name +"'s total is " + "$" +total);

    }
}
