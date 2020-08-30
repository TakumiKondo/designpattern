package visitor.sample.main;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String _name;
    private ArrayList<Entry> _dir = new ArrayList<>();

    public Directory(String name) {
        _name = name;
    }

    public String name() {
        return _name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int size() {
//        int size = 0;
//        Iterator<Entry> it = _dir.iterator();
//        while(it.hasNext()) {
//            size += it.next().size();
//        }
//        return size;
        SizeVisitor sv = new SizeVisitor();
        accept(sv);
        return sv.size();
    }

    public Entry add(Entry entry) {
        _dir.add(entry);
        return this;
    }

    public Iterator<Entry> iterator() {
        return _dir.iterator();
    }
}

