public class CalculatorTest3 {
    public static void main(String[] args) {
        
       Calculator3 calc = new Calculator3();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
       calc.findTotal(10.0, "Person1");
       calc.findTotal(12.0, "Person2");
       calc.findTotal(9.0, "Person3");
       calc.findTotal(8.0, "Person4");
       calc.findTotal(7.0, "Person5");
       calc.findTotal(15.0, "Alex");
       calc.findTotal(11.0, "Person7");
       calc.findTotal(30.0, "Person8");

       
       
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}
