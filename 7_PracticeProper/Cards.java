public class Cards {
    private int currentCreditBalance = 0;
    private int currentTicketBalance = 0;
    private String cardNumber = "";
    private int cardCounter = 0;
    private int cardBookingAccount = 0;

    public int getCurrentCreditBalance() {
        return currentCreditBalance;
    }

    public void setCurrentCreditBalance(int currentCreditBalance) {
        this.currentCreditBalance = currentCreditBalance;
    }

    public int getCurrentTicketBalance() {
        return currentTicketBalance;
    }

    public void setCurrentTicketBalance(int currentTicketBalance) {
        this.currentTicketBalance = currentTicketBalance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardCounter(){
        return cardCounter;
    }

    public int getCardBookingAccout(){
        return cardBookingAccount;
    }

    public Cards(int creditBalance, int ticketBalance, String cardNumber){
        currentCreditBalance = creditBalance;
        currentTicketBalance = ticketBalance;
        this.cardNumber = cardNumber;
    }
}
