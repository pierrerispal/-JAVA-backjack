/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author stageinfo
 */
public class Deck {

    private ArrayList<Card> list;

    /**
     * generating a deck with 52 cards that's all
     *
     * @params int j : number of copy of cards you want the more there are, the
     * harder it gets to count the cards
     */
    public Deck(int j) {
        list = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("club", "spade", "diamond", "hearth"));
        for (int k = 0; k < j; k++) {
            for (String color : colors) {
                for (int i = 1; i < 11; i++) {
                    Card temp = new Card(color, String.valueOf(i));
                    list.add(temp);
                }
                Card J = new Card(color, "J");
                list.add(J);
                Card Q = new Card(color, "Q");
                list.add(Q);
                Card K = new Card(color, "K");
                list.add(K);
            }
        }
    }

    public ArrayList<Card> getList() {
        return list;
    }

    /**
     * remove a card from the deck (no not get the same twice obviously)
     *
     * @param i
     */
    public void removeCard(int i) {
        this.list.remove(i);
    }

    @Override
    public String toString() {
        return "Deck{" + "list=" + list + '}';
    }

}
