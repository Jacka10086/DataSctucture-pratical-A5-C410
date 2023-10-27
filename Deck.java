package Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    
    // 使用ArrayList存储牌组中的所有卡牌
    private ArrayList<Card> deck = new ArrayList<Card>();

    // 构造函数，用来初始化一个包含52张牌的标准扑克牌组
    public Deck() {
        // 循环生成52张牌
        for (int i = 0; i < 52; i++) {
            // 根据循环的索引添加卡牌，这里将52张牌分成4个花色，每种花色13张牌
            this.deck.add(new Card(i % 13, i / 13));
        }
        // 将牌组中的卡牌打乱，模拟洗牌过程
        Collections.shuffle(this.deck);
    }

    // 从牌组中发出一张牌
    public Card deal() {
        // 检查牌组是否还有牌
        if (this.deck.size() > 0) {
            // 取出牌组顶部的卡牌
            Card card = this.deck.get(0);
            // 从牌组中移除这张卡牌
            this.deck.remove(0);
            // 返回这张卡牌
            return card;
        } else {
            // 如果牌组中没有牌了，返回null
            return null;
        }
    }
    
    // 重写toString方法，用于打印牌组中的所有卡牌
    public String toString() {
        String resultStr = "\n";
        // 遍历牌组中的每一张卡牌，并将其添加到要返回的字符串中
        for (Card card : this.deck) {
            resultStr += card + "\n";
        }
        return resultStr;
    }
}
