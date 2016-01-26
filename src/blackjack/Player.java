package blackjack;

import java.util.ArrayList;


public class Player {
    private double money;
    private ArrayList<Card> hand;
    private double bet; //money bet

    //==========================================================================
    //==========================================================================
    //==========================================================================
    public Player() {
        this.hand=new ArrayList<>();
        this.money = 5000.00;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public double getBet() {
        return bet;
    }
    
    //==========================================================================
    //========================UTILITIES=========================================
    //==========================================================================
    
    //place a bet
    public void bet(double amount){
        this.bet=amount;
        this.money-=amount;
    }
    public void addCard(Card card){
        this.hand.add(card);
    }
    public int getScore(){
        int total=0;
        for(Card card:this.hand){
            total+= card.getValue();
        }
        return total;
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
