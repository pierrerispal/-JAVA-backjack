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
     * @param card 
     */
    public void addCard(Card card){
        this.cards.add(card);
    }
    /**
     * get the score of the hand
     * @return int
     */
    public int getScore(){
        int total=0;
        boolean as=false;
        for(Card card:this.cards){
            if(card.getValue()==1){
                as = true;
                total+= 11;
            }else{
                total+= card.getValue();
            }            
        }
        if(as==true && total>21){
            total-=10;
        }
        return total;
    }
    /**
     * get the ieme card of the hand
     * @param i
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
        return "cards=" + cards;
    }
}
