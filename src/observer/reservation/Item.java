package observer.reservation;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private List<User> _reserveUsers;
    private String _itemName;

    public Item(String itemName) {
        _reserveUsers = new ArrayList<>();
        _itemName = itemName;
    }

    public String itemName() {
        return _itemName;
    }

    public void reserve(User user) {
        _reserveUsers.add(user);
    }

    public void cancel(User user) {
        _reserveUsers.remove(user);
    }

    public void arrival() {
        System.out.println(itemName() + "が入荷しました。");
        for (User user : _reserveUsers) {
            user.notification();
        }
    }

}
