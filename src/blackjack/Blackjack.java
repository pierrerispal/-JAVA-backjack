/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;

/**
 *
 * @author stageinfo
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Round rnd=new Round();
        //rnd.startingBet();
        rnd.startingCards();
        System.out.println(rnd.player.getHand().toString());
        System.out.println(rnd.blackjackCheckPlayer());
    }
    
}
