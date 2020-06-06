package observer.reservation;

public class User {
    private String _name;

    public User(String name) {
        _name = name;
    }

    public String name() {
        return _name;
    }

    public void notification() {
        System.out.println(name() + "さんに通知します。");
    }

}
