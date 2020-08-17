package decorator;

public class SideBorder extends Border {
    private char _ch;

    protected SideBorder(Display display, char ch) {
        super(display);
        _ch = ch;
    }

    public int getColumns() {
        return 1 + _display.getColumns() + 1;
    }

    public int getRows() {
        return _display.getRows();
    }

    public String getRowText(int row) {
        return _ch + _display.getRowText(row) + _ch;
    }

}
