package blackjack;

import java.util.Random;
import java.util.Scanner;


public class Round {
    public Random random;
    public Deck deck;
    public Player player;
    public Banquer banquer;
    Scanner sc = new Scanner(System.in);

    public Round() {
        this.banquer=new Banquer();
        this.deck=new Deck(4);
        this.player=new Player();
        this.random=new Random();
    }
    /**
     * the player (or @TODO players) got to bet at first
     * @TODO Change for android adaptation
     */
    public void startingBet(){
        System.out.print("Bet : ");
        String str = sc.nextLine();
        this.player.bet(Double.valueOf(str));
    }
    /**
     * fill the player and banquer's hand
     * @TODO maybe a collection of players and for each one give 2 cards
     * can be interesting to generalize the operations in case of multiples
     * players
     */
    public void startingCards(){
        //Hand generation
        int randomInt = random.nextInt(deck.getList().size());
        int randomInt2 = random.nextInt(deck.getList().size());
        int randomInt3 = random.nextInt(deck.getList().size());
        int randomInt4 = random.nextInt(deck.getList().size());
        
        player.getHand().addCard(deck.getList().get(randomInt));
        deck.removeCard(randomInt);
        player.getHand().addCard(deck.getList().get(randomInt2));
        deck.removeCard(randomInt2);
        banquer.getHand().addCard(deck.getList().get(randomInt3));
        deck.removeCard(randomInt3);
        banquer.getHand().addCard(deck.getList().get(randomInt4)); 
        deck.removeCard(randomInt4);
    }
    /**
     * Checking if the banquer's first card is an As
     * @return boolean
     */
    public boolean insuranceCheck(){
        return (banquer.getHand().get(0).getValue()==1);
    }
    /**
     * Checking if the player has a blackjack at the beggining
     * @TODO banquer and player(s) will be separated because reasons
     * @return boolean
     */
    public boolean blackjackCheckPlayer(){
        return((player.getHand().get(0).getValue()==1 ||player.getHand().get(1).getValue()==1)&&player.getHand().getScore()==11);
    }
}
