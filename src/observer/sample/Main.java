package observer.sample;

public class Main {
    public static void main(String...strings) {
//        NumberGenerator generator = new RandomNumberGenerator();

        IncremntalNumberGenerator generator = new IncremntalNumberGenerator(10, 50, 5);
        Observer graphObserver = new GraphObserver();
        Observer digitObserver = new DigitObserver();
        Observer FrameObserver = new FrameObserver();

        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);
        generator.addObserver(FrameObserver);

        generator.excute();
    }
}
