package facade.librarian;

import java.util.ArrayList;
import java.util.List;

//貸出帳
public class LendingList {
    private List<String> _record = new ArrayList<String>();

    public void lending(String bookName) {
        _record.add(bookName);
    }

    public void returned(String bookName) {
        _record.remove(bookName);
    }

    public boolean isLending(String bookName) {
        return _record.contains(bookName);
    }
}