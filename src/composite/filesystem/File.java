package composite.filesystem;

public class File implements FileComponent {
    private String _name;

    public File(String name) {
        _name = name;
    }

    @Override
    public void operation(int depth) {
        for(int i = 0; i < depth; i++) System.out.print(" ");
        System.out.println(name());
    }

    @Override
    public String name() {
        return _name;
    }

}
