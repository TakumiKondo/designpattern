package strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random _random;
    private int _prevHandValue = 0;
    private int _currentHandValue = 0;
    private int[][] history = {
            {1,1,1},
            {1,1,1},
            {1,1,1},
    };

    public ProbStrategy(int seed) {
        _random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = _random.nextInt((getSum(_currentHandValue)));
        int handValue = 2;
        if(bet < history[_currentHandValue][0]) {
            handValue = 0;
        }
        if(bet < history[_currentHandValue][0] + history[_currentHandValue][1]) {
            handValue = 1;
        }
        _prevHandValue = _currentHandValue;
        _currentHandValue = handValue;
        return Hand.getHand(handValue);
    }

    private int getSum(int hv) {
        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win) {
            history[_prevHandValue][_currentHandValue]++;
        }else {
            history[_prevHandValue][(_currentHandValue + 1) % 3]++;
            history[_prevHandValue][(_currentHandValue + 2) % 3]++;
        }
    }

}
