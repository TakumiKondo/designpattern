package prototype.base;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> showcase = new HashMap<>();
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String protoname) {
        Product p = showcase.get(protoname);
        return p.createClone();
    }
}
