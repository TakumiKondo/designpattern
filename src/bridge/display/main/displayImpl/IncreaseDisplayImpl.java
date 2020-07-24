package bridge.display.main.displayImpl;

public class IncreaseDisplayImpl extends DisplayImpl {
    private char _head;
    private char _body;
    private char _foot;

    public IncreaseDisplayImpl(char head, char body, char foot){
        _head = head;
        _body = body;
        _foot = foot;
    }

    @Override
    public void rawOpen() {
        System.out.print(_head);
    }

    @Override
    public void rawPrint() {
        System.out.print(_body);
    }

    @Override
    public void rawClose() {
        System.out.println(_foot);
    }

}
