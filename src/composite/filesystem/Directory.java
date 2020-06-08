package composite.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent {
    private List<FileComponent> _fileComponents = new ArrayList<FileComponent>();
    private String _name;

    public Directory(String name) {
        _name = name;
    }

    @Override
    public void operation(int depth) {
        for(int i = 0; i < depth; i++) System.out.print(" ");
        System.out.println(name());
        for(FileComponent component: _fileComponents) {
            component.operation(depth + 1);
        }
    }

    public void add(FileComponent fileComponent) {
        _fileComponents.add(fileComponent);
    }

    public void remove(FileComponent fileComponent) {
        _fileComponents.remove(fileComponent);
    }

    public List<FileComponent> getChild(){
        return _fileComponents;
    }

    @Override
    public String name() {
        return _name;
    }

}
