package templateMethod.sample;

public abstract class StringLister {
    protected abstract String header();
    protected abstract String footer();
    public final String body(String[] items) {
        StringBuilder result = new StringBuilder(header());
        for(String item: items)
            result.append(item + System.getProperty("line.separator"));
        result.append(footer());
        return result.toString();
    }
}
