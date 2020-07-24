package bridge.display.main.display;

import java.util.Random;

import bridge.display.main.displayImpl.DisplayImpl;

public class RandomCountDisplay extends CountDisplay {
    private Random random = new Random();

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        super.multiDisplay(random.nextInt(times));
    }

}
