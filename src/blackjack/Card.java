package blackjack;


public class Card {
    private final int value; //from 1 to 11
    private final String color; //club diamonds hearths spades
    private final String pic; //from 1 to king (since all figures worth 10)

    /**
     * Generating a card with a color and a pic, the value is set depending on the pic
     * King queen both have a value of 10
     * pic will be used for the card picture shown on the screen
     * @param color
     * @param pic 
     */
    public Card(String color, String pic) {
        this.color = color;
        this.pic = pic;
        if("K".equals(pic) || "Q".equals(pic) || "J".equals(pic)){
            this.value=10;
        }else{
            this.value=Integer.parseInt(pic);
        }
    }

    public int getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }

    public String getPic() {
        return pic;
    }

    @Override
    public String toString() {
        return pic;
    }
    
    
    
}
