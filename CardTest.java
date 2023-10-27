package Card;

public class CardTest {

    public static void main(String[] args) {
        // 创建一个新的牌组
        Deck deck = new Deck();
        
        // 打印初始的牌组内容
        System.out.println(deck);

        // 从牌组中发出一张牌，并打印这张牌的内容
        System.out.println(deck.deal());
        // 重复上述操作，再次发出四张牌并打印
        System.out.println(deck.deal());
        System.out.println(deck.deal()); 
        System.out.println(deck.deal());
        System.out.println(deck.deal());

        // 打印发牌后的牌组内容
        System.out.println(deck);
    }
}
