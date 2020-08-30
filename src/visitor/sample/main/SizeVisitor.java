package visitor.sample.main;

import java.util.Iterator;

public class SizeVisitor extends Visitor{
    private int _size;

    @Override
    public void visit(File file) {
        _size += file.size();
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while(it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
    }

    public int size() {
        return _size;
    }

}
