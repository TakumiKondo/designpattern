package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
	private List<Book> books;

	public BookShelf(int initialCapacity) {
		this.books = new ArrayList<Book>(initialCapacity);
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void appendBook(Book book) {
		this.books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	public Iterator iterator() {
//		return new BookShelfIterator(this);
		return new BookShelfIterator2(this);
	}

}
