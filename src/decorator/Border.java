package decorator;

public abstract class Border extends Display {
    protected Display _display;
    protected Border(Display display) {
        _display = display;
    }
}
