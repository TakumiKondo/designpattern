package composite.account;

public class Statement extends AccountComponent {
    private String _name;
    private int _amount;

    public Statement(String name, int amount) {
        _name = name;
        _amount = amount;
    }

    @Override
    public int sum() {
        System.out.println(name() + ":" + amount());
        return _amount;
    }

    public int amount() {
        return _amount;
    }

//    @Override
    public String name() {
        return _name;
    }

}
