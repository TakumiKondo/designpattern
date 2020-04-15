package templateMethod.sample;

public class HtmlLister extends StringLister {

    @Override
    protected String header() {
        return "<body>" + System.getProperty("line.separator");
    }

    @Override
    protected String footer() {
        return "</body>" + System.getProperty("line.separator");
    }

}
