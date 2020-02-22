package observer.sample;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random ramdom = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void excute() {
        for(int i = 0; i < 5; i++) {
            number = ramdom.nextInt(10);
            notifyObservers();
        }
    }

}
