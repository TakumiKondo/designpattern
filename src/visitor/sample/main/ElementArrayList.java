package visitor.sample.main;

import java.util.ArrayList;
import java.util.List;

public class ElementArrayList implements Element {
    private List<Entry> _list = new ArrayList<Entry>();

    @Override
    public void accept(Visitor visitor) {
        for(Entry e : _list) {
            e.accept(visitor);
        }
    }

    public void add(Entry entry) {
        _list.add(entry);
    }


}
