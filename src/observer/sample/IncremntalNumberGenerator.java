package observer.sample;

public class IncremntalNumberGenerator extends NumberGenerator {
    private int _number;
    private int _endNumber;
    private int _incrementNumber;

    IncremntalNumberGenerator(int startNumber, int endNumber, int incrementNumber) {
        _number = startNumber;
        _endNumber = endNumber;
        _incrementNumber = incrementNumber;
    }

    @Override
    public int getNumber() {
        return _number;
    }

    @Override
    public void excute() {
        while(_number < _endNumber) {
            notifyObservers();
            _number += _incrementNumber;
        }
    }

}
