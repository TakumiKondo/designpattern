package templateMethod.sample;

public class Main {
    public static void main(String... args) {
        SimpleLister sl = new SimpleLister();
        HtmlLister hl = new HtmlLister();

        String[] items = {"first", "second", "third"};
        System.out.println( sl.body(items) );
        System.out.println( hl.body(items) );
    }

}
