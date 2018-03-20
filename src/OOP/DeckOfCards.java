package OOP;

public class DeckOfCards {
    public static void main(String[] args){

    }
}



class Card{
    public enum Suit{
        CLUBS (1), SPADES (2), HEARTS (3), DIAMONDS (4);
        int value;
        private Suit(int v){
            value = v;
        }
    }
    private int card;
    private Suit suit;
    public Card(int c, Suit s){
        card = c;
        suit = s;
    }
    public int value() { return card; }
    public Suit suit() { return suit; }
}