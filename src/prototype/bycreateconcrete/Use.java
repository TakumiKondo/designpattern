package prototype.bycreateconcrete;

public class Use {
    public static void main(String...strings) {

        Manager manager = new Manager();

        UnderLinePen upen = new UnderLinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product p1 = manager.create("strong message");
        p1.use("Hello World!");
        Product p2 = manager.create("warning box");
        p2.use("Hello World!");
        Product p3 = manager.create("slash box");
        p3.use("Hello World!");
    }
}
