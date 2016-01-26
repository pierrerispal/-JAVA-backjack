package blackjack;


public class Card {
    private final int value; //from 1 to 11
    private final String color; //club diamonds hearths spades
    private final String pic; //from 1 to king (since all figures worth 10)

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
        return "Card{" + "value=" + value + ", color=" + color + ", pic=" + pic + '}';
    }
    
    
    
}
