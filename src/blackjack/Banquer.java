/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author stageinfo
 */
public class Banquer {
    private ArrayList<Card> hand;

    public Banquer() {
        this.hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
    public void addCard(Card card){
        this.hand.add(card);
    }
    public void hit(){
        
    }
    public void stand(){
        
    }
    
}
