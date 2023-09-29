public class SavingsBond {
    public int term;
    public double price;
    public double intrestRate;
    public double amountAtEndOfTerm;
    public SavingsBond(int userTerm, double purchasePrice){
        term = userTerm;
        price = purchasePrice;
        if(0 <= term && term <= 11){
            intrestRate = 0.005;
        } else if(12 <= term && term <= 23){
            intrestRate = 0.01;
        } else if(24 <= term && term <= 35){
            intrestRate = 0.015;
        } else if(36 <= term && term <= 47){
            intrestRate = 0.02;
        } else if(48 <= term && term <= 60){
            intrestRate = 0.025;
        } else{
            System.out.println("Error: That is an invalid term limit");
        }
        amountAtEndOfTerm = (price *Math.pow((1+intrestRate), term));
    }
    public void displayBond(){
        System.out.println("Bond term (in months): " + term);
        System.out.println("The bond rate is: " + intrestRate);
        System.out.println("You purchased your bond for: $" + price);
        System.out.println("After " + term + " months the expected earnings is: $" + amountAtEndOfTerm);
    }
}
