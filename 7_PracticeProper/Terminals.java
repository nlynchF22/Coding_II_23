import java.util.Scanner;
public class Terminals {
    Scanner sc = new Scanner(System.in);
    int money = 0;
    String cardBalance = "";

    public Terminals(int money){
        this.money = money;
    }

    public int buyCreds(Cards card){
        card.setCurrentCardBalance(card.getCurrentCreditBalance() + (money*2));
    }

    public void checkCardBalance(Cards card){
        System.out.println("The card : " + card.getCardNumber() + " currently has " + card.getCurrentCreditBalance() + " credits currently.");
    }
}
