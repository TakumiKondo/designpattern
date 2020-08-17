package decorator;

import java.io.UnsupportedEncodingException;

public class StringDisplay extends Display {
    private String _str;

    public StringDisplay(String str) {
        _str = str;
    }

    @Override
    public int getColumns() {
        int strLength = 0;
        try {
            strLength = _str.getBytes("MS932").length;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return strLength;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0) return _str;
        return null;
    }

}
