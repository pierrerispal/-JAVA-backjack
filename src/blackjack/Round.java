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
    //==========================================================================
    //========================STARTING STUFF====================================
    //==========================================================================
    /**
     * the player (or @TODO players) got to bet at first
     * @TODO Change for android adaptation
     */
    public void startingBet(){
        System.out.print("Bet : ");
        String str = sc.nextLine();
        this.player.bet(Double.valueOf(str));
        //this.player.bet(10);
    }
    /**
     * fill the player and banquer's hand
     * @TODO maybe a collection of players and for each one give 2 cards
     * can be interesting to generalize the operations in case of multiples
     * players
     */
    public void startingCards(){
        this.deck=new Deck(4);
        //Hand generation
        int randomInt = random.nextInt(deck.getList().size());
        player.getHand().addCard(deck.getList().get(randomInt));
        deck.removeCard(randomInt);
        int randomInt2 = random.nextInt(deck.getList().size());
        player.getHand().addCard(deck.getList().get(randomInt2));
        deck.removeCard(randomInt2);
         int randomInt3 = random.nextInt(deck.getList().size());
        banquer.getHand().addCard(deck.getList().get(randomInt3));
        deck.removeCard(randomInt3);
        int randomInt4 = random.nextInt(deck.getList().size());
        banquer.getHand().addCard(deck.getList().get(randomInt4)); 
        deck.removeCard(randomInt4);
        //System.out.println(player.getHand());
    }
    //==========================================================================
    //========================VERIFICATION STUFF================================
    //==========================================================================
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
    public boolean checkInfMax(Hand hand){
        return (hand.getScore()<22);
    }
    //==========================================================================
    //========================PLAYABLE==========================================
    //==========================================================================
    /**
     * function that ask the player for choice for what he wanna do
     * @TODO change for android
     */
    public void choice(){
        System.out.println("Player : "+player.getHand());
        System.out.println("Banquer : "+banquer.getHand());
        System.out.println("1: double | 2: hit | 3: stand");
        String choice = sc.nextLine();

        //if the player choose to double go to endOfROund
        if("1".equals(choice)){
            player.doubleBet(this.deck);
            this.endOfTurn();
        }
        //if the player choose to get a new card do the choice again
        if("2".equals(choice)){
            player.hit(this.deck);
            this.choice();
        }
        if("3".equals(choice)){
            this.endOfTurn();
        }
        //if the player choose to stand go to EndOFTurn
    }
    /**
     * function that ask the player for choice for what he wanna do
     * @TODO change for android
     */
    public void insuranceChoice(){
        
    }
    /**
     * at the end of the turn, gve the money to the winners
     */
    public void endOfTurn(){
        System.out.println(player.getHand().getScore()+","+banquer.getHand().getScore());
        //@TODO What appen when both have blackjack
        if((player.getHand().getScore()>banquer.getHand().getScore() || this.blackjackCheckPlayer())&& player.getHand().getScore()<22){
            player.win(this.blackjackCheckPlayer());
        }else{
            System.out.println("perdu");
        }
        System.out.println("MONEY : "+player.getMoney());
        System.out.println("=====================================================");
    }
    
    //==========================================================================
    //========================PROCESSUS=========================================
    //==========================================================================
    public void processus(){
        player.getHand().empyHand();
        banquer.getHand().empyHand();
        //first do the bet
        this.startingBet();
        //then give the cards
        this.startingCards();
        //then check of a blackjack or an insurance
        if(this.blackjackCheckPlayer()){
            this.endOfTurn();
        }
        if(this.insuranceCheck()){
            System.out.println("insurance");
            //this.insuranceChoice();
        }
        //@TODO check for score
        //then give the choice to the player
        this.choice();
        
    }
}
