package visitor.sample.main;

public class File extends Entry {
    private String _name;
    private int _size;

    public File(String name, int size) {
        _name = name;
        _size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String name() {
        return _name;
    }

    @Override
    public int size() {
        return _size;
    }

}
