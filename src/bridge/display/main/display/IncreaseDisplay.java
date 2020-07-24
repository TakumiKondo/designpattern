package bridge.display.main.display;

import bridge.display.main.displayImpl.DisplayImpl;

public class IncreaseDisplay extends CountDisplay {
    private int _step;

    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        _step = step;
    }

    public void increaseDisplay(int level) {
        int count = 0;
        for(int i = 0; i < level; i++) {
            super.multiDisplay(count);
            count += _step;
        }
    }

}
