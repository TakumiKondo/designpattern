package facade.librarian;

public class Visitor {
    private String _name;
    private String _targetBookName;

    Visitor(String name){
        _name = name;
    }

    public void setTargetBookName(String targetBookName) {
        _targetBookName = targetBookName;
    }

    public String targetBookName() {
        return _targetBookName;
    }

    public String name() {
        return _name;
    }
}
