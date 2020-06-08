package composite.html;

public abstract class HtmlComponent {
    protected String _tag;

    abstract public String create(String indent);

    public String create() {
        return create("");
    }

    public String tag() {
        return "<" + _tag + ">";
    }

    public String closeTag() {
        return "</" + _tag + ">";
    }
}
