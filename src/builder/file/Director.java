package builder.file;

public class Director {
    private Builder _builder;

    public Director(Builder builder) {
        _builder = builder;
    }

    public Builder constructor() {
        _builder.makeTitle("Title");
        _builder.makeString("String");
        _builder.makeItems(new String[] {
                "aaaa",
                "bbbb",
                "cccc"
        });
        _builder.close();

        return _builder;
    }
}
