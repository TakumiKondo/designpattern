package state.basic;

public class Main {
    public static void main(String... args) {

        Context contextA = new Context(new ConcreteA());
        contextA.run();
        contextA.walk();

        Context contextB = new Context(new ConcreteB());
        contextB.run();
        contextB.walk();
    }
}
