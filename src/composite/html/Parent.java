package composite.html;

import java.util.ArrayList;
import java.util.List;

public class Parent extends HtmlComponent {
    private List<HtmlComponent> _htmlComponents = new ArrayList<HtmlComponent>();

    public Parent(String tag) {
        _tag = tag;
    }

    @Override
    public String create(String indent) {
        String tagCompsite = "";
        tagCompsite += indent + tag() + System.lineSeparator();
        for(HtmlComponent htmlComponent: _htmlComponents) {
            tagCompsite += htmlComponent.create(indent + " ");
        }
        tagCompsite += indent + closeTag() + System.lineSeparator();
        return tagCompsite;
    }

    public void add(HtmlComponent htmlComponent) {
        _htmlComponents.add(htmlComponent);
    }

    public void remove(HtmlComponent htmlComponent) {
        _htmlComponents.remove(htmlComponent);
    }

}
