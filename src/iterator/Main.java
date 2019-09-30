package iterator;

public class Main {
	public static void main(String[] args) {
		BookShelf bs = new BookShelf(4);
		bs.appendBook(new Book("Gitの本"));
		bs.appendBook(new Book("Javaの本"));
		bs.appendBook(new Book("C#の本"));
		bs.appendBook(new Book("PHPの本"));
		bs.appendBook(new Book("Pythonの本"));

		Iterator it = bs.iterator();
		while(it.hasNext()) {
			Book bk = (Book)it.next();
			System.out.println(bk.getName());
		}
	}
}
