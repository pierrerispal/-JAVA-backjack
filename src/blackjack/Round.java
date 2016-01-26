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
        this.deck=new Deck();
        this.player=new Player();
        this.random=new Random();
    }
    /*
    * @TODO Change for android adaptation
    */
    public void startingBet(){
        System.out.print("Bet : ");
        String str = sc.nextLine();
        this.player.bet(Double.valueOf(str));
    }
    public void startingCards(){
        //Hand generation
        int randomInt = random.nextInt(deck.getList().size());
        int randomInt2 = random.nextInt(deck.getList().size());
        int randomInt3 = random.nextInt(deck.getList().size());
        int randomInt4 = random.nextInt(deck.getList().size());
        
        player.addCard(deck.getList().get(randomInt));
        player.addCard(deck.getList().get(randomInt2));
        banquer.addCard(deck.getList().get(randomInt3));
        banquer.addCard(deck.getList().get(randomInt4));        
    }
    public boolean insuranceCheck(){
        return (banquer.getHand().get(0).getValue()==1);
    }
    public boolean blackjackCheckPlayer(){
        return true;
    }
}
