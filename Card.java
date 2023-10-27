package Card;

import java.util.Random;

public class Card {

    // 代表牌的数字或者是字母（如J,Q,K,A）
    private int rank;
    // 代表牌的花色
    private int suit;

    // 所有可能的数字或字母
    private static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
                                     "10", "Jack", "Queen", "King", "Ace"};

    // 所有可能的花色
    private static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    // 构造函数，生成一个随机的卡牌
    public Card() {
        Random random = new Random();
        this.rank = random.nextInt(Card.ranks.length); // 在所有可能的数字/字母中随机选择一个
        this.suit = random.nextInt(Card.suits.length); // 在所有可能的花色中随机选择一个
    }

    // 构造函数，根据提供的数字/字母和花色生成一个卡牌
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    // 获取牌的数字或字母
    public String getRank() {
        return Card.ranks[this.rank];
    }

    // 获取牌的花色
    public String getSuit() {
        return Card.suits[this.suit];
    }

    // 判断当前的牌是否比另一张牌大
    public boolean isBiggerThan(Card otherCard) {
        return this.rank > otherCard.rank;
    }

    // 将卡牌转换为字符串表示，例如：“Ace of Spades”
    public String toString() {
        return getRank() + " of " + getSuit();
    }
}
