package composite.html;

public class Child extends HtmlComponent {

    public Child(String tag) {
        _tag = tag;
    }

    @Override
    public String create(String indent) {
        return indent + tag() + closeTag() + System.lineSeparator();
    }

}
