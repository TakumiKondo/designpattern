package prototype.bycreateconcrete;

public abstract class ConcreteProduct implements Product {

    @Override
    public abstract void use(String s);

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

}
