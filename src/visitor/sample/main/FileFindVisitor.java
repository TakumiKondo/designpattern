package visitor.sample.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor{
    private String _ext;
    private List<File> _files = new ArrayList<File>();

    public FileFindVisitor(String ext) {
        _ext = ext;
    }

    public String ext() {
        return _ext;
    }

    @Override
    public void visit(File file) {
        if(file.name().endsWith(_ext)) {
            _files.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while(it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
    }

    public Iterator<File> getFoundFiles() {
        return _files.iterator();
    }

}
