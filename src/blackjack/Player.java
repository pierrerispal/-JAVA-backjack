package blackjack;
import java.util.Random;

public class Player {
    private double money;
    private Hand hand;
    private double bet; //money bet

    //==========================================================================
    //==========================================================================
    //==========================================================================
    public Player() {
        this.hand=new Hand();
        this.money = 5000.00;
    }

    public double getMoney() {
        return money;
    }

    public Hand getHand() {
        return hand;
    }

    public double getBet() {
        return bet;
    }
    
    //==========================================================================
    //========================UTILITIES=========================================
    //==========================================================================
    
    /**
     * setting a bet
     * @param amount 
     */
    public void bet(double amount){
        this.bet=amount;
        this.money-=amount;
    }
    
    //==========================================================================
    //========================PLAYABLE==========================================
    //==========================================================================
    public void doubleBet(){
        this.money-=this.bet;
        this.bet+=this.bet;
        //@TODO @GOTO endOfTurn
    }
    //@TODO send the deck as param
    public void hit(){
        Random random=new Random();
        /*int randomInt = random.nextInt(deck.getList().size());
        
        this.getHand().addCard(deck.getList().get(randomInt));
        deck.removeCard(randomInt);*/
    }
    public void stand(){
        //@TODO @GOTO endOfTurn
    }
    public void insurance(){
        
    }

    @Override
    public String toString() {
        return "Player{" + "hand=" + hand + '}';
    }
    
}
