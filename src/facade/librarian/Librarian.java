package facade.librarian;

// 司書
public class Librarian {
    private BookList _bookList;
    private LendingList _lendingList;

    Librarian(BookList bookList, LendingList lendingList){
        _bookList = bookList;
        _lendingList = lendingList;
    }

    public String searchBook(String bookName) {
        //所蔵されているか？
        if(!_bookList.existsBook(bookName)) return "その本は所蔵していません";

        //書棚にあるか？
        if (_lendingList.isLending(bookName)) return "貸出中です";

        // 所蔵場所
        return _bookList.searchLocation(bookName);
    }
}