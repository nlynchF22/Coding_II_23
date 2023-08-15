public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 15.99;
        double tax = 0.09;
        int quantity = 4;
        
        
        // Declare and assign a calculated totalPrice
        double totalPrice = (price * quantity) * (1 + tax);
        
        // Modify message to include quantity 
        message = custName + " wants to purchase " + quantity + " " + itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
        message = "Total cost with tax is: $" + totalPrice;
        System.out.println(message);
    }    
}
