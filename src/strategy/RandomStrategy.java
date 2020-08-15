package strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random _random;

    public RandomStrategy(int seed) {
        _random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(_random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
    }

}
