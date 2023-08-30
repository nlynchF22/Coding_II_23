public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        double grandTotal = 0;
        //Name your friends
        grandTotal += calc.findTotal(10, "Eduardo");
        grandTotal += calc.findTotal(12, "Will");
        grandTotal +=calc.findTotal(9,  "Noah");
        grandTotal += calc.findTotal(8,  "Toast");
        grandTotal += calc.findTotal(7,  "Cloaker");
        grandTotal += calc.findTotal(15, "Alex");
        grandTotal += calc.findTotal(11, "Kiler");
        grandTotal += calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
       System.out.println(grandTotal);
    } 
}
