package decorator;

public class UpDownBorder extends Border {
    private char _ch;

    protected UpDownBorder(Display display, char ch) {
        super(display);
        _ch = ch;
    }

    @Override
    public int getColumns() {
        return _display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + _display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0 || row == _display.getRows() + 1) {
            return endLine();
        }
        return _display.getRowText(row - 1);
    }

    private String endLine() {
        StringBuffer line = new StringBuffer(_ch);

        for(int i = 0; i < _display.getColumns(); i++) {
            line.append(_ch);
        }
        line.append(_ch);

        return line.toString();
    }

}
