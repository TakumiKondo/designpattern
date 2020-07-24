package bridge.display.main;

import bridge.display.main.display.CountDisplay;
import bridge.display.main.display.Display;
import bridge.display.main.display.IncreaseDisplay;
import bridge.display.main.display.RandomCountDisplay;
import bridge.display.main.displayImpl.IncreaseDisplayImpl;
import bridge.display.main.displayImpl.StringDisplayImpl;
import bridge.display.main.displayImpl.TextDisplayImpl;

public class Main {
    public static void main(String[] args) {
        Display d = new Display(new StringDisplayImpl("Display Test"));
        CountDisplay cd = new CountDisplay(new StringDisplayImpl("CountDisplay Test"));
        RandomCountDisplay rcd = new RandomCountDisplay(new StringDisplayImpl("Random"));
        Display textDisp = new Display(new TextDisplayImpl("C:\\pleiades\\workspace\\designpattern\\doc\\aaaa.txt"));
        CountDisplay countTextDisp = new CountDisplay(new TextDisplayImpl("C:\\pleiades\\workspace\\designpattern\\doc\\aaaa.txt"));
        IncreaseDisplay incDisp = new IncreaseDisplay(new IncreaseDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay sharpDisp = new IncreaseDisplay(new IncreaseDisplayImpl('|', '#', '-'), 2);

        d.display();
        cd.multiDisplay(5);
        rcd.randomDisplay(5);
        textDisp.display();
        countTextDisp.multiDisplay(3);
        incDisp.increaseDisplay(5);
        sharpDisp.increaseDisplay(3);
    }
}
