package observer.sample;

public class DigitObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("Digit Generator : " + generator.getNumber());
        try {
            Thread.sleep(100);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}
