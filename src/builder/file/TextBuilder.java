package builder.file;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    public String result() {
        return buffer.toString();
    }


    @Override
    protected void buildTitle(String title) {
        buffer.append("---------------------------------------" + System.lineSeparator());
        buffer.append(title + System.lineSeparator());
        buffer.append(System.lineSeparator());
    }


    @Override
    protected void buildString(String str) {
        buffer.append("■" + str + System.lineSeparator());
        buffer.append(System.lineSeparator());
    }


    @Override
    protected void buildItems(String[] items) {
        for(String item: items) {
            buffer.append(item + System.lineSeparator());
        }
    }


    @Override
    protected void buildDone() {
        buffer.append("---------------------------------------" + System.lineSeparator());
    }
}
