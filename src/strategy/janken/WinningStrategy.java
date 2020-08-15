package strategy.janken;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random _random;
    private boolean _won = false;
    private Hand _prevHand;

    public WinningStrategy(int seed) {
        _random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!_won) {
            _prevHand = Hand.getHand(_random.nextInt(3));
        }
        return _prevHand;
    }

    @Override
    public void study(boolean win) {
        _won = win;
    }

}
