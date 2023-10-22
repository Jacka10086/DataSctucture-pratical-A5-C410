package Card;

import java.util.Random;

public class Card {

    private int rank;
    private int suit;

    private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
                                     "10", "Jack", "Queen", "King", "Ace"};

    private static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    public Card() {
        Random random = new Random();
        this.rank = random.nextInt(Card.ranks.length);
        this.suit = random.nextInt(Card.suits.length);
    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public String getRank() {
        return Card.ranks[this.rank];

    }

    public String getSuit() {
        return Card.suits[this.suit];
    }

    public boolean isBiggerThan(Card otherCard) {
        return this.rank > otherCard.rank;
    }

    public String toString() {
        return getRank() + " of " + getSuit();
    }
    
}
