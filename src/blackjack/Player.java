package blackjack;


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
        
    }
    public void hit(){
        
    }
    public void stand(){
        
    }
    public void insurance(){
        
    }

    @Override
    public String toString() {
        return "Player{" + "hand=" + hand + '}';
    }
    
}
