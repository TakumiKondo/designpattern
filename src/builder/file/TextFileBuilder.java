package builder.file;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileBuilder extends Builder {
    private FileWriter _fileWriter;
    private String _fileName;

    @Override
    public String result() {
        return _fileName;
    }

    @Override
    protected void buildTitle(String title) {
        _fileName = title + ".txt";
        try {
            _fileWriter = new FileWriter(_fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void buildString(String str) {
        try {
            _fileWriter.write(str + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void buildItems(String[] items) {
        try {
            for(String item: items) {
                _fileWriter.write(item  + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void buildDone() {
        try {
            _fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
