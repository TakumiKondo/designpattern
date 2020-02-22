package observer.sample;

public class Main {
    public static void main(String...strings) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer graphObserver = new GraphObserver();
        Observer digitObserver = new DigitObserver();
        generator.addObserver(graphObserver);
        generator.addObserver(digitObserver);
        generator.excute();
    }
}
