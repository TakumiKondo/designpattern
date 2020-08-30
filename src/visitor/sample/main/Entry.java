package visitor.sample.main;

import java.util.Iterator;

public abstract class Entry implements Element {

    public abstract String name();
    public abstract int size();
    public Entry add(Entry entity) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public Iterator<Entry> iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public String toString() {
        return name() + " (" + size() + ")";
    }

}
