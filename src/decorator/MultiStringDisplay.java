package decorator;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private List<String> _strList = new ArrayList<String>();
    private int _maxColumn = 0;

    @Override
    public int getColumns() {
        return _maxColumn;
    }

    @Override
    public int getRows() {
        return _strList.size();
    }

    @Override
    public String getRowText(int row) {
        return _strList.get(row);
    }

    public void add(String str) {
        _strList.add(str);
        updateMaxColumn();
        updateStrList();
    }

    private void updateMaxColumn() {
        for(int i = 0; i < _strList.size(); i++) {
            int strLineLength = strLineLength(_strList.get(i));
            if(_maxColumn < strLineLength) {
                _maxColumn = strLineLength;
            }
        }
    }

    private void updateStrList() {
        for(int i = 0; i < _strList.size(); i++) {
            fillSpaces(i);
        }
    }

    private void fillSpaces(int strListIndex) {
        int strLineLength = strLineLength(_strList.get(strListIndex));
        StringBuffer spaces = new StringBuffer();
        if(strLineLength < _maxColumn) {
            for(int count = _maxColumn - strLineLength; count > 0; count--) {
                spaces.append(" ");
            }
            _strList.set(strListIndex, _strList.get(strListIndex) + spaces.toString());
        }
    }

    private int strLineLength(String strLine) {
        int strLineLength = 0;
        try {
            strLineLength = strLine.getBytes("MS932").length;
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        return strLineLength;
    }





}
