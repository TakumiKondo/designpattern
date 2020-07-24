package bridge.display.test.display;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bridge.display.main.display.RandomCountDisplay;
import bridge.display.main.displayImpl.DisplayImpl;
import bridge.display.main.displayImpl.StringDisplayImpl;

class RandomCountDisplayTest {

    @Test
    void カウント数0未満は例外() {
        DisplayImpl impl = new StringDisplayImpl("test");
        RandomCountDisplay rcd = new RandomCountDisplay(impl);
        assertThrows(IllegalArgumentException.class,
                () -> rcd.randomDisplay(-1));
    }

}
