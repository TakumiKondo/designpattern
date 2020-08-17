package decorator;

public class FullBorder extends Border {

    protected FullBorder(Display display) {
        super(display);
    }

    public int getColumns() {
        return 1 + _display.getColumns() + 1;
    }

    public int getRows() {
        return 1 + _display.getRows() + 1;
    }

    public String getRowText(int row) {
        // 上端 or 下端
        if(row == 0 || row == _display.getRows() + 1) {
            return endLine();
        }

        // 装飾本体
        return "|" + _display.getRowText(row - 1) + "|";
    }

    private String endLine() {
        char endCh = '+', lineCh = '-';
        StringBuffer line = new StringBuffer();

        line.append(endCh);
        for(int i = 0; i < _display.getColumns(); i++) {
            line.append(lineCh);
        }
        line.append(endCh);

        return line.toString();
    }

}
