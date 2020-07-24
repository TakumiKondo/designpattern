package bridge.display.main.displayImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextDisplayImpl extends DisplayImpl {
    private String _path;
    private File _textFile;
    FileReader _fileReader = null;
    BufferedReader _bufferedReader = null;

    public TextDisplayImpl(String path) {
        _path = path;
    }

    @Override
    public void rawOpen() {
        _textFile = new File(_path);
        if(!_textFile.exists())
            throw new IllegalStateException(_textFile + " : 指定されたファイルは存在しません。");
    }

    @Override
    public void rawPrint() {
        try {
            _fileReader = new FileReader(_textFile);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        _bufferedReader = new BufferedReader(_fileReader);
        String line;
        try {
            while ((line = _bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        try {
            _bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
