package facade.librarian;

import java.util.HashMap;
import java.util.Map;

//所蔵本台帳
public class BookList {
    private Map<String, String> _record = new HashMap<String, String>();

    public void addRecord(String bookName, String locationName) {
        _record.put(bookName, locationName);
    }

    public boolean existsBook(String bookName) {
        return _record.containsKey(bookName);
    }

    public String searchLocation(String bookName) {
        return (String)_record.get(bookName);
    }
}
