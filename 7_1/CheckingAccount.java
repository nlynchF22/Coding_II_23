public class CheckingAccount {
   public double balance;
   public String name;


    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
    }
    
    public void withdrawBalance(double withdraw){
        if(withdraw > balance){
            System.out.println("Warning: The amount you are trying to withdraw is higher than your current balance.");
    
        }else if(withdraw<0){
            System.out.println("Warning: You can not withdraw a negative number.");
    
        }else{
        balance -= withdraw;
        System.out.println(balance);
        }
    }
}