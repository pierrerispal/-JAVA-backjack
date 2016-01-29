package blackjack;

import java.util.ArrayList;


public class Hand {    
    private ArrayList<Card> cards;

    public Hand() {
        this.cards= new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
    /**
     * Add a card to the hand
     * @param Card 
     */
    public void addCard(Card card){
        this.cards.add(card);
    }
    /**
     * get the score of the hand
     * @TODO if its an As, check if its under or above 21 to choose if the As 
     * will be 1 or 11
     * @return int
     */
    public int getScore(){
        int total=0;
        for(Card card:this.cards){
            total+= card.getValue();
        }
        
        return total;
    }
    /**
     * get the ieme card of the hand
     * @param int
     * @return Card
     */
    public Card get(int i){
        return this.cards.get(i);
    }
    public void empyHand(){
        this.cards=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Hand{" + "cards=" + cards + '}';
    }
}
