package strategy;

public class Hand {
    private int handValue;
    private static String[] name = {
        "グー", "チョキ", "パー",
    };

    public static final int HANDVALUE_GUU = 0;
    public static final int HANDVALUE_CHO = 1;
    public static final int HANDVALUE_PAA = 2;

    public static final Hand[] hand = {
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA),
    };

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return figth(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return figth(h) == -1;
    }

    private int figth(Hand h) {
        if(this == h) {
            return 0;
        }
        if((handValue + 1 ) % 3 == h.handValue){
            return 1;
        }
        return -1;
    }

    public String toString() {
        return name[handValue];
    }
}
