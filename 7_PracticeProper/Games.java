import java.util.Random;
public class Games {
    private int creditCost = 15;

    public int getCreditCost() {
        return creditCost;
    }

    public void setCreditCost(int creditCost) {
        this.creditCost = creditCost;
    }

    Random randomNum = new Random();

    public void playGame(Cards card){
        card.setCurrentCreditBalance(card.getCurrentCreditBalance() - getCreditCost());
        card.setCurrentTicketBalance(card.getCurrentTicketBalance() + randomNum.nextInt(30) +1);
    }
}
