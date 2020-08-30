package visitor.sample.main;

public interface Element {
    public abstract void accept(Visitor visitor);
}
